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
	        int l=str.length();
	        HashMap<Character,Integer> hm= new HashMap<>();
	        for(char ch: str.toCharArray())
	        {
	            if(hm.get(ch)==null)
	            {
	                hm.put(ch,1);
	            }
	            else
	            {
	                hm.put(ch,hm.get(ch)+1);
	            }
	        }
	        boolean flag=true;
	            for(Map.Entry<Character, Integer> m : hm.entrySet())
	            {
	                if(m.getValue()> (str.length()/2 + str.length()%2))
	                {
	                    flag=false;
	                }
	            }
	            if(flag)
	                System.out.println(1);
	            else
	                System.out.println(0);
	        }
	    }
		//code
	}
