import java.io.*;
import java.util.*:
class Solution {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(Syestem.in);
        String s =sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    int isPlaindrome(String S) {
         String rev = "";
         char ch;
         int l=S.length();
        for(int i=0;i<l;i++)
        {
            ch = S.charAt(i);
            rev = ch+rev;
        }
        if(rev.equals(S))
            return 1;
        else
            return 0;
        // code here
    }
};