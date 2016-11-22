public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(map.contanisKey(target - nums[i])){
                result[0] = i + 1;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            
            map.put(nums[i], i);
        }
        
        return result;
    }
}