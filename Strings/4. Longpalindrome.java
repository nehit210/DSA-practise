import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        int max=1;
	        int min=0;
	        int l=s.length();
	        int start,end;
	        for(int i=1;i<l;i++)
	        {
	            start=i-1;
	            end=i;
	            while(start>=0&&end<l&&s.charAt(start)==s.charAt(end))
	            {
	                if(end-start+1>max)
	                {
	                    min=start;
	                    max=end-start+1;
	                }
	                --start;
	                ++end;
	            }
	            start=i-1;
	            end=i+1;
	            while(start>=0&&end<l&&s.charAt(start)==s.charAt(end))
	            {
	                if(end-start+1>max)
	                {
	                    min=start;
	                    max=end-start+1;
	                }
	                --start;
	                ++end;
	            }
	        }
	        display(s,min,min+max-1);
	        
	    }//code
	}
	static void display(String str,int min,int max)
	{
	    System.out.println( str.substring( min, max + 1));
	}
}