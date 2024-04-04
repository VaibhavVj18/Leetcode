class Solution {
    public int[] applyOperations(int[] nums) 
    {
        int l=nums.length;
        int[]ans=new int[l];
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                ans[c]=nums[i];
                c++;
            }
        }
        return ans;
    }
}