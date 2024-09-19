import java.util.*;
public class Main
{
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
	    System.out.println("Prime Numbers from below 10");
	    int count = 0;
		for(int i=2; i<=20; i++)
		{
		    if(isPrime(i))
		    {
		        System.out.print(i+" ");
		        count++;
		    }
		}
		System.out.print("\nTotal numberof prime numbers are: "+count);
	}
}
