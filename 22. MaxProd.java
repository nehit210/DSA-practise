import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("the maximum product subarray is" + maxProduct(arr,n));
}
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long min=arr[0];
        long max=arr[0];
        long prod=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                long temp=min;
                min=max;
                max=temp;
            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            prod=Math.max(prod,max);
        }// code here
      return prod;  
    }
}