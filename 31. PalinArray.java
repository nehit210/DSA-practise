import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(palinArray(arr,n));
    }
    static boolean palindrome(int n)
           {
                  int num=n,rev=0;
                  while(num!=0)
                  {
                      int r=num%10;
                      rev=(rev*10)+r;
                      num=num/10;
                  }
                  if(rev==n)
                  return true;
                  else
                  return false;//add code here.
           }
           public static int palinArray(int[] a,int n)
           {
               for(int i=0;i<n;i++)
               {
                   boolean palin=palindrome(a[i]);
                   if(palin==false)
                   {
                       return 0;
                   }
               }
               return 1;
           }
}