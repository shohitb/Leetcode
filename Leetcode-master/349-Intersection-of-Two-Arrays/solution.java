public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> interset = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                interset.add(nums2[j]);
            }
        }
        
        
        int[] result = new int[interset.size()];
        int i=0;
        for(Integer num: interset){
            result[i++] = num;
        }
        
        return result;
    }
}