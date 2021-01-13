import java.io.*;
import java.util.*;
class Inversion_of_Array
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        int count=inversionCount(arr,n);
        System.out.println("The inversion count is "+ count);
    }
    static long inversionCount(long arr[], long N)
    {
        int c =0;
   for(int i=0;i<N-1;i++)
   {
       for(int j=i;j<N;j++)
       {
           if(arr[i]>arr[j])
           {
               c++;
           }
       }

    }
    return c;
}