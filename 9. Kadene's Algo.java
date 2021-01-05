import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum contiguous sum is " +
                                       maxSubarraySum(arr,n));
    }
    static int maxSubarraySum(int arr[], int n){
    int sum=0,sum1=0;
    for(int i=0;i<n;i++)
    {
        sum1+=arr[i];
        if(sum1>sum)
        {
            sum=sum1;
        }
        if(sum1<0)
        {
            sum1=0;
        }
    }
    return sum;
    }
    
}