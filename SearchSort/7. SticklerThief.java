import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new solve().FindMaxSum(arr, n));
	 }
   }
}// } Driver Code Ends


class solve{
    // Function to return maximum of sum without adjacent elements
    public int FindMaxSum(int arr[], int n){
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return arr[0]>arr[1]?arr[0]:arr[1];
        }
        int sum[]=new int[n];
        sum[0]=arr[0];
        sum[1]=arr[0]>arr[1]?arr[0]:arr[1];
        for(int i=2;i<n;i++)
        {
            int temp=arr[i]+sum[i-2];
            if(temp>sum[i-1])
            {
                sum[i]=temp;
            }
            else
            {
                sum[i]=sum[i-1];
            }
        }
        return sum[n-1];// Your code here
    }
}