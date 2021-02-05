import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Compute obj = new Compute();
            System.out.println(obj.findSubString(str).length());
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute 
{
    public String findSubString( String str) 
    {
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            hs.add(str.charAt(i));
        }// Your code goes here
        int n=hs.size();
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0,ii=0,jj=0,count=0;
        int win=Integer.MAX_VALUE;
        while(i<=j && j<str.length())
        {
            if(count<n)
            {
                count = (hm.get(str.charAt(j))==null)?count+1:count;
                hm.put(str.charAt(j),(hm.get(str.charAt(j))==null)?1:hm.get(str.charAt(j))+1);
                j++;
            }else
            {
                if(win> (j-i))
                {
                    win = j-i;
                    ii=i;
                    jj=j;
                }
                count = (hm.get(str.charAt(i))==1)?count-1:count;
                if(hm.get(str.charAt(i))==1)
                    hm.remove(str.charAt(i));
                else
                    hm.put(str.charAt(i),hm.get(str.charAt(i))-1);
                i++;
            }
        }
        while(count==n)
        {
            if(win> (j-i))
            {
                win = j-i;
                ii=i;
                jj=j;
            }
            count = (hm.get(str.charAt(i))==1)?count-1:count;
            if(hm.get(str.charAt(i))==1)
                hm.remove(str.charAt(i));
            else
                hm.put(str.charAt(i),hm.get(str.charAt(i))-1);
            i++;
        }
        return str.substring(ii,jj);
}
}