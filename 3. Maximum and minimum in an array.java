import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int min;
   
    static int max;
    
    static void maxmin(int arr[],int n)
   
    {
  
      int i;
  
      if(n==1)
 
       {
  
          min=arr[0];

          max=arr[1];  

       }
 
      if(arr[0]>arr[1])
 
       {
 
           max=arr[0];
 
           min=arr[0];
 
       }
 
       else
 
      if(arr[0]<arr[1])

        {

            max=arr[1];

            min=arr[0];

        }
   
   for(i=2;i<n;i++)
  
       {   

           if(arr[i]>max)  

            max=arr[i];
  
           else 

           if(arr[i]<min)  

            min=arr[i];
 
        }
 
    }

public static void main (String[] args) 
 {

   Scanner sc = new Scanner(System.in);
	
   int i,n;

   System.out.println("Enter the size of array \n");

   n=sc.nextInt();
		
   int arr[]=new int[n];
		
   System.out.println("enter the elements\n");
		
   for(i=0;i<n;i++)
		
    {
		    
      arr[i]=sc.nextInt();

    }
		
   maxmin(arr,n);
   System.out.print("Maximum element in the array is " + max);

   System.out.println();
		
   System.out.println("Minimum element in the array is " + min);
	
  }
}
