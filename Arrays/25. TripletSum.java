import java.io.*;
import java.util.*;
class TripletSum
{
    // arr[] : The input Array
    // N : Size of the Array
    // X : Sum which you need to search for 
    public static void main(String[] args)
    {
        Scanner sc=new scanner(system.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(find3Numbers(arr,n,x)==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    
    }
     static int find3Numbers(int arr[], int N, int X)
     { 
       for(int i=0;i<N-2;i++)
       {
           int sum = X-arr[i];
           HashMap<Integer, Integer> hm = new HashMap<>();
           for(int j=i+1;j<N;j++)
           {
                if(hm.containsKey(sum-arr[j]))
                {
                    return 1;
                }
                else
                {
                    hm.put(arr[j],1);
                }
            
           }
       } 
       return 0;
    }
}