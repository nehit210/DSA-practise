import java.io.*;
import java.util.*;
class Parenthesis
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            if(ispar(str)==true)
            {
                System.out.println("Balanced");
            }
            else
            {
                System.out.println("Not Balanced");
            }
        }
    }
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        int i;
        Stack<Character> s=new Stack<>();
        int len=x.length();
        for( i=0;i<len;i++)
        {
            char ch=x.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
            {
                s.push(ch);
            }
            else
            {
                if(s.isEmpty())
                {
                return false;
                }
            else
            {
                
                char c=s.pop();
                if((c=='{'&&ch=='}')||(c=='('&&ch==')')||(c=='['&&ch==']'))
                    continue;
                    else
                    return false;
                }
            }
        }
        if(s.isEmpty())
        return true;
        else 
        return false;
        // add your code here
    }
}
