import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            arrange(arr,n);
            System.out.println("rearranged array is");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+ " ");
                System.out.println();
            }
    }   
    static void arrange(int arr[], int n) 
    {
        int i=0,j=n-1;
        while(i<j)
        {
           while(i<=n-1&&arr[i]>0)
           {
               i++;
           }
           while(j>=0&&arr[j]<0)
           {
               j--;
           }
           if(i<j)
           swap(arr,i,j);
        }   
        int k=0;
        while(k<n&&i<n)
        {
            swap(arr,k,i);
            i++;
            k+=2;
        }
    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }    
    }