import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int A[]=new int[n];
	    int B[]=new int[m];
	    for(int i=0;i<n;i++)
	    {
	        A[i]=sc.nextInt();
	    }
	    for(int i=0;i<m;i++)
	    {
	        B[i]=sc.nextInt();
	    }
	    HashSet<Integer> hs=new HashSet<>();
	    for(int i=0;i<n;i++)
	    {
	        hs.add(A[i]);
	    }
	    for(int j=0;j<m;j++)
	    {
	        hs.add(B[j]);
	    }
	    System.out.println("the union of 2 array is");
	   System.out.println(hs);
		//code
	}
}