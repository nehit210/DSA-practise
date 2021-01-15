/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    BigInteger f= new BigInteger("1");
		    for(int i=1;i<=n;i++)
		    {
		        f=f.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(f);
		}
		//code
	}
}