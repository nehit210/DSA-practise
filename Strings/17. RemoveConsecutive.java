import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        Stack<Character> s=new Stack<>();
        int l =S.length();
        while(--l >=0)
        {
            if(s.size()==0)
            {
                st.push(S.charAt(l));
                continue;
            }
            else 
            if(s.peek().equals(S.charAt(l)))
            {
                continue;
            }
            else
            {
                s.push(S.charAt(l));
            }
        }
        Iterator value = st.iterator(); 
        String res="";
        while (value.hasNext()) 
        { 
            res= value.next()+res; 
        } 
        return res;
    }
}