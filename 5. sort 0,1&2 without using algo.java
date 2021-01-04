import java.io.*;
import java.util.*;
class Main
{
    public static void main(String []args)
    {
        int n,i;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort012(arr,n);
        System.out.println("Sorted array is ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
   public static void sort012(int arr[], int n)
    {
        int  i,c1=0,c2=0,c3=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                c1++;
            }
            else
            if(arr[i]==1)
            {
                c2++;
            }
            else
            if(arr[i]==2)
            {
                c3++;
            }
        }
        i=0;
        while(c1>0)
        {
           arr[i++]=0;
           c1--;
        }
        while(c2>0)
        {
           arr[i++]=1;
           c2--;
        }
        while(c3>0)
        {
           arr[i++]=2;
           c3--;
        }
    }
}
