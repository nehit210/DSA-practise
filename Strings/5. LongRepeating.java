import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=LongestRepeatingSubsequence(s);
        System.out.println(s);
    }
    static int LongestRepeatingSubsequence(String str)
    {
        int l = str.length();
        int[][] res = new int[l+1][l+1];
        for (int i=1; i<=l; i++)
        {
            for (int j=1; j<=n; j++)
            {
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    res[i][j] =  1 + res[i-1][j-1];          
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return res[l][l];
    }
}