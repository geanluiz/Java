public class Main {

    public static void main(String[] args){

        int[] nums = {1,3,5,6};
        int target = 7;

        Solution solution = new Solution();
        
        System.err.println("result:" + solution.searchInsert(nums, target));
    }
}
