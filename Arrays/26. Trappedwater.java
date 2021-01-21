import java.io.*;
import java.util.*;
class Trap{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("the amount of water that can be trapped is" + trappingWater(arr,n));
    }
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
        int x=arr[0],sum=0,xi=0;
        int temp=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=x)
            {
                x=arr[i];
                xi=i;
                temp=0;
            }
            else
            {
                sum+=x-arr[i];
                temp+=x-arr[i];
            }
            
        }
        if(xi<n-1)
        {
            sum-=temp;
            x=arr[n-1];
        }
        for(int i=n-1;i>=xi;i--)
        {
            if(arr[i]>=x)
            {
                x=arr[i];
            }
            else
            {
                sum+=x-arr[i];
            }
        }
        return sum;
        // Your code here
        
    } 
}