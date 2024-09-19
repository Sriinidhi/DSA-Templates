import java.util.*;
public class Main {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

  public static void main(String[] args) {
	    String s1 = "12321";//odd length
    String s2 = "abba";//even length
    String s3 = "143";
	  
	    System.out.println("is Palindrome "+s1+" "+isPalindrome(s1));
	    System.out.println("is Palindrome "+s2+" "+isPalindrome(s2));
	    System.out.println("is Palindrome "+s3+" "+isPalindrome(s3));
	}
}
