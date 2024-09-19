import java.util.*;
public class Main {
    
    public static void rev(int[] arr, int left, int right) {
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
      public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6};
        int n = 6, k = 4;
        rev(arr, n-k, n-1);//reverse last k elemnets n-k to n-1
        rev(arr, 0, n-k-1);//reverse first k elemnets 0 to n-k-1
        rev(arr, 0, n-1);//reverse whole array
        
        for(int i=0 ; i<n ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


/*
before = [1, 2, 3, 4, 5, 6]

after = [3, 4, 5, 6, 1, 2]

*/
