
// Time Complexity : O(N)
//Space Complexity : O(N) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums == null || nums.length == 0) return new int[]{0};

     Map<Integer, Integer> map = new HashMap<>();
     for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];

         if (map.containsKey(complement)) {

             return new int[] { map.get(complement), i };
         }

         map.put(nums[i], i);
     }

     return nums;
 }
 }