import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	   String str=sc.next();
	   int n=res(str.toCharArray());
	   System.out.println(n);
		}//code
	}
	static int res(char[] ch )
	{
	    int c1=0,c2=0;
	    for(int i=0;i<ch.length;i++)
	    {
	        if(i%2!=0)
	        {
	            if(ch[i]=='0')
	            ++c1;
	            if(ch[i]=='1')
	            ++c2;
	        }
	        else
	        {
	            if(ch[i]=='1')
	            ++c1;
	            if(ch[i]=='0')
	            ++c2;
	        }
	    }
	     return Math.min(c1,c2);
	}
}