public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int result1 = 0;
        for(int i=0; i<nums.length; i++){
            result = (result ^ nums[i]) & ~result1;
            result1 ^= (result ^ nums[i]) & ~result;
        }
        
        return result;
    }
}