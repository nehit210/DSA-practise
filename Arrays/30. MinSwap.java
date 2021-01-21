import java.io.*;
import java.util.*;
class Complete{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the minimum number of swaps are" minSwap(arr,n,x);
    }    
   
    // Function for finding maximum and value pair
    static int minSwap (int arr[], int n, int k) {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            ++c;
        }
        int c1=0;
        int start=0,end=c;
        for(int j=0;j<end;j++)
        {
            if(arr[j]>k)
            ++c1;
        }
        int minans=c1;
        while(end<n)
        {
            if(arr[start]>k)
            --c1;
            if(arr[end]>k){
            ++c1;
            }
            minans=Math.min(minans,c1);
            start++;
            end++;
        }
        return minans;
        //Complete the function
    }
    
    
}
