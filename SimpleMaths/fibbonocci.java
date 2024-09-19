import java.util.*;
public class Main
{
    public static int fib(int n) {
      if(n==0)
      return 0;
      
      if(n==1)
      return 1;
      
      return fib(n-1) + fib(n-2);
    }
    
	public static void main(String[] args) {
	    int n =7;
	    System.out.println("fibnnoci sequence up to "+n);
	    
	    for(int i=0 ; i<=n ; i++){System.out.print(fib(i)+" ");}
	    
	}
}
