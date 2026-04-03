class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> seen_numbers = new HashSet<>();

      for (int i = 0; i < nums.length; i++) {
        int num = nums[i];

        if (seen_numbers.contains(num)) {
            return true;
        }
        seen_numbers.add(num);
      }  
      return false;
    }
}