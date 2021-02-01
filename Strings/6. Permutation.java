import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        int n=s.length();
	        ArrayList<String> a=new ArrayList<>();
	        permut(s,0,n-1,a);
	        Collections.sort(a);
	        for(String i : a)
	        {
	            System.out.print(i+ " ");
	        }
	        System.out.println();
	    }
	    //code
	}
	static void permut(String str,int start,int end,ArrayList<String>arr)
	{
	    if(start==end)
	    {
	        arr.add(str);
	    }
	    else
	    for(int i=start;i<=end;i++)
	    {
	        str=swap(str,start,i);
	        permut(str,start+1,end,arr);
	        str=swap(str,start,i);
	    }
	}
	static String swap(String str,int s,int e)
	{
	    char[] a=str.toCharArray();
	    char ch;
	    ch=a[s];
	    a[s]=a[e];
	    a[e]=ch;
	    return String.valueOf(a);
	}
}