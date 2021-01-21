import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
     
        System.out.println("The mminimum number of jump to reach end is" + minJumps(arr));
    }    
    static int minJumps(int[] arr){
        int jump[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
             jump[i]=Integer.MAX_VALUE;
        }
        jump[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<=arr[j]+j&&jump[j]!=Integer.MAX_VALUE)
                {
                    jump[i]=Math.min(jump[i],jump[i+1]);
                }
            }
        }
        return jump[arr.length-1];
        // your code here
        }
    
}