import java.io.*;
import java.util.*;
class Main {
    static int findDuplicate(int[] nums) {
        int i,x=0;
        for( i=0;i<nums.length;i++)
        {
           nums[nums[i]%nums.length]=nums[nums[i]%nums.length]+nums.length;
            
        }
        for( i=0;i<nums.length;i++)
        {
            if(nums[i]>(nums.length*2))
            {
                x=i;
            }
        }
        return x;
    }
public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("the duplicate number is");
        System.out.println(findDuplicate(num));
    }
    
}
