class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if (length==0 || length==1)
            return length;
        int i=1;
        for (int j=1;j<length;j++)
        {
            if (nums[j]!=nums[j-1])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        if (i<length)
            nums[i]='\0';
        return i;
        
    }
}
