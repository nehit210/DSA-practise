import java.io.*;
import java.util.*;
class Compute {
    public static void main(String[] args)
    {
        Scanner sc=new Scannr(System.in);
        long n=sc.nextLong();
        long arr[]=new long[(int)(n)];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        long x= sc.nextLong();
        System.out.println("The smallest subarray is"+ sb(arr,n,x));
    }

    static long sb(long a[], long n, long x) {
        long sum=0;
        int l=Integer.MAX_VALUE;
        int start=0,end=0;
        while(end<n)
        {
            while(sum<=x&&end<n)
            {
            sum+=a[end++];
            }
            while(sum>x&&start<=end)
            {
                if(end-start<l)
                {
                    l=end-start;
                }
                sum-=a[start++];
            }
        }
        return l;
        // Your code goes here 
    }
}