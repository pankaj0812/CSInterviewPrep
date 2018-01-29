class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - k;
        reverse(nums, 0, n-1);
        reverse(nums, n, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
    }
    
    public void reverse(int[] A, int left, int right){
        while(left<right){
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
        
    }
}
