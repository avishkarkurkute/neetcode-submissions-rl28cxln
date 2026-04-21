class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        //This is for the prefix sum
        result[0] = 1;
        for(int i = 1;i < nums.length;i++){
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        //This for postfix sum;
        int suffix = 1;
        for(int i = n - 1;i >= 0;i--){
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }
        return result;
    }
}  
