/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
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
	        int x= arr[n-1];
	        for(int i=(n-1);i>0;i--)
	        {
	            arr[i]=arr[i-1];
	        }
	        arr[0]=x;
	        System.out.println("Rotated array is");
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	    
		}//code
	}
}