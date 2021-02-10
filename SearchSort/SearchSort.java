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
	        int x=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int first=-1,last=-1;
	        for(int i=0;i<n;i++)
	        {
	            if(x!=arr[i])
	            {
	                continue;
	            }
	            if(first==-1)
	            {
	                first=i;
	            }
	            last=i;
	        }
	        if(first!=-1)
	        {
	        System.out.println(first + " " + last);
	        }
	        else
	        System.out.println(-1);
	        
	    }
		//code
	}
}
