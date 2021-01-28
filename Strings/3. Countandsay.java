
import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(coountAndSay(n));
    }
    public String countAndSay(int n) {
        String s="1";
        for(int i=0;i<n-1;i++)
        {
            char ch=s.charAt(0);
            StringBuilder str=new StringBuilder();
            int c=1;
            for(int j=1;j<s.length();j++)
            {
                if(ch!=s.charAt(j))
                {
                    str.append(c);
                    str.append(ch);
                    c=0;
                    ch=s.charAt(j);
                }
                    c++;
            }
            str.append(c);
            str.append(ch);
            s=str.toString();
        }
        
        return s;
    }
}