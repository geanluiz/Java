public class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length;

        if (nums.length == 0) return 0;
        
        if (nums.length == 1) {
            if (target <= nums[0]) return 0;
            
            if (target > nums[0]) return 1;
        }
        
        int mid = end;
        
        while (end - start != 0) {
            mid = ((end - start) / 2) + start;
                        
            if (target == nums[mid]) {
                return mid;
            } 
            
            
            if (target < nums[mid]) {
                if (end == mid) return end + 1;
                end = mid;
            }
            
            if (target > nums[mid]) {
                if (start == mid) return end;
                start = mid;
            }
        }

        return mid;
    }
}
