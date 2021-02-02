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
	    int i;
	    int len=str.length();
	    if(len%2!=0)
	    {
	        System.out.println("-1");
	    }
	    else{
	    Stack<Character> s=new Stack<>();
	    int c=0,c1=0;
	    for(i=0;i<len;i++)
	    {
	        char ch=str.charAt(i);
	        if(ch=='{')
	        {
	            s.push(ch);
	            c++;
	        }
	        else
	        {
	            if(ch=='}'&&!s.empty())
	            {
	                s.pop();
	                c--;
	            }
	            else
	            c1++;
	        }
	    }
	    if(c%2==0)
	    c=c/2;
	    else
	    c=(c/2)+1;
	    if(c1%2==0)
	    c1=c1/2;
	    else
	    c1=(c1/2)+1;
	    System.out.println(c+c1);
		//code
	    }
	    }
	}
}