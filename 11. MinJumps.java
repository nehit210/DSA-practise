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
        if(arr[0]==0)
        {
            return -1;
        }
        int jump[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
             jump[i]=Integer.MAX_VALUE;
        }
        jump[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(i<=arr[j]+j&&jump[j]!=Integer.MAX_VALUE)
                {
                    c++;
                    if(jump[i]>(jump[j]+1))
                    {
                        jump[i]=jump[j]+1;
                    }
                }
            }
            if(c==0)
            {
                return -1;
            }
        }
        return jump[arr.length-1];
        }
    
}
