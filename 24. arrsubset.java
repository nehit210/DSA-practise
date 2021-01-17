import java.util.*;
import java.lang.*;
import java.io.*;

class arrsubset {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        int arr1[]=new int[m];
	        int arr2[]=new int[n];
	        for(int i=0;i<m;i++)
	        {
	            arr1[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            arr2[i]=sc.nextInt();
	        }
	       if(subset(arr1,arr2,m,n))
	       {
	           System.out.println("Yes");
	       }
	       else
	       System.out.println("No");
	    }
		//code
	}
	static boolean subset(int arr1[],int arr2[],int m,int n)
	{
	     HashSet<Integer> hs=new HashSet<>();
	        for(int i=0;i<m;i++)
	        {
	            if(!hs.contains(arr1[i]))
	            {
	                hs.add(arr1[i]);
	            }
	        }
	        for(int i=0;i<n;i++)
	        {
	            if(!hs.contains(arr2[i]))
	            {
	                return false;
	            }
	        }
	        return true;
	}
}