import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        threeWayPartition(arr,a,b);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        int n=array.length;
        int start=0,end=n-1;
        for(int i=0;i<=end;)
        {
            if(array[i]<a)
            {
                int temp=array[start];
                array[start]=array[i];
                array[i]=temp;
                start++;
                i++;
            }
            else
            if(array[i]>b)
            {
                int temp=array[end];
                array[end]=array[i];
                array[i]=temp;
                end--;
            }
            else
            i++;
        }// code here 
    }
}