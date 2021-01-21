import java.io.*;

import java.util.*;

 class Main
 {
    public static void main(String []args)
    {
        int n,t,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of tet cases\n");
        t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of array\n");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the value of k");
            k=sc.nextInt();
            System.out.println("the kth smallest element is "+ kthSmallest(arr,0,n-1,k));
        }
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       if(k>0 && k<= r-1+1)
       {
          int pos= Partition(arr,l,r);
           if(pos-l==k-1)
             return arr[pos];
           if(pos-l>k-1)
             return kthSmallest(arr,l,pos-1,k);
        return kthSmallest(arr,pos+1,r,k-pos+l-1);  
       }//Your code here
    return -1;
    } 
    static void swap(int arr[],int i, int j)
    {
      int temp;
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    public static int Partition(int arr[],int l,int r)
    {
      int pivot= arr[r];
      int i=l;
      int j;
      for(j=l;j<r;j++)
      {
        if(arr[j]<=pivot)
          {
            swap(arr,i,j);
            i++;
          }
      }
      swap(arr,i,r);
      return i;
    }
     
}