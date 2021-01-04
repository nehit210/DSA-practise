import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

    static void reverse_array(int arr[],int start,int end)
 {
        int rev;
      
  while(start<end)
        
   { 
        
    rev=arr[start];
 
           arr[start]=arr[end];
 
           arr[end]=rev;
  
          start++;

            end--;
        
    }
  
  }
    
static void display(int arr[],int n)
    {

        int i; 
     
   for(i=0;i<n;i++)
       
 {
            
System.out.print(arr[i]+ " ");
            
System.out.println();
     
   }

    }

	public static void main (String[] args) {

		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the size of an array");

		int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	int i;

		
		for(i=0;i<n;i++)

		{

		    arr[i]=sc.nextInt();

		}

		display(arr,n);
		
reverse_array(arr,0,n-1);
	
	System.out.println("Reverse array is/n");

		display(arr,n);

		} 	
	
