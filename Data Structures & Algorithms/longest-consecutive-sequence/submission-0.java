class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        int longest = 0;
        for(int number : numsSet){
            if(!numsSet.contains(number - 1)){
                int current = number;
                int length = 1;
                while(numsSet.contains(current + 1)){
                    length++;
                    current++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest; 
    }
}
