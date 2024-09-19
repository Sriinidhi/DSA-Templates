import java.util.*;
public class Main
{
    public static int fact(int n) {
      
        if(n==1 || n==0)
        {
            System.out.print(" "+n);
            return 1;
        }
        System.out.print(" "+n+" *");
        return n * fact(n-1);
    }
    
	public static void main(String[] args) {
	    System.out.println("factorial of a number");
		System.out.print("\n"+fact(5));
	}
}
