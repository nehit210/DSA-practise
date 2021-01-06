import java.io.*;
import java.util.*;
class Main {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int difference=getMinDiff(arr,n,k);
        System.out.println("The minimised difference is "+ difference);
    }
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int max=0,min=0;
        int diff=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
            min=Math.min(arr[0]+k,arr[i]-k);
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            diff=Math.min(diff,max-min);
            }
        }
        return diff;
        // code here
    }
}