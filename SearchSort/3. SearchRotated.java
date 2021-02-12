class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int flag=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(target==nums[i])
            {
                flag=1;
                x=i;
            }
        }
        if(flag==0)
        {
            return -1;
        }
        else
            return x;
    }
}