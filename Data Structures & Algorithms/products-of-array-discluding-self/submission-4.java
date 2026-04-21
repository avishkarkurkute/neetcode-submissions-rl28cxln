class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num = 1;
        int count = 0;
        int index = 0;
        boolean isZeroExist = false;
        for(int i = 0;i < nums.length;i++){
            num *= nums[i];
            if(nums[i] == 0){
                isZeroExist = true;
            }
        }
        if(isZeroExist){
            num = 1;
            for(int i = 0;i < nums.length;i++){
                if(nums[i] == 0){
                    count++;
                    index = i;
                    continue;
                }
                num *= nums[i];
            }
            if(count == 1){
                int[] exSelfProductP = new int[nums.length];
                exSelfProductP[index] = num;
                return exSelfProductP;
            }else{
                return new int[nums.length];
            }
        }
        int[] exSelfProduct = new int[nums.length];

        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                exSelfProduct[i] = num/nums[i];
            }
        }
        return exSelfProduct;
    }
}  
