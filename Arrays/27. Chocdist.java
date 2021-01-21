import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int m=sc.nextInt();
	        if(n<m)
	        System.out.println("Not enough packets");
	        else
	        Arrays.sort(arr);
	    int sum=Integer.MAX_VALUE;
	    for(int i=0;i+m-1<n;i++)
	    {
	        int diff = arr[i+m-1] - arr[i];
            if (diff < sum)
                sum = diff;
	    }
	    System.out.println(sum);
	    }
		//code
	}
}