import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt;
        int arr[]=new int[n];
        for(int i=0;i<n.i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=maxProfit(arr);
        System.out.println("the maximum profit is"+ max);
    }
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        for(int i=n-1;i>0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                  if(prices[i]-prices[j]>max)
            {
                max=prices[i]-prices[j];
            }
            }    
        }
        return max;
    }
}