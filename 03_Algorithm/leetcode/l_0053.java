package leetcode;

public class l_0053 {
    //[5,4,-1,7,8]
    //[-2,1,-3,4,-1,2,1,-5,4]
    public static void main(String[] args) {
        Solution_l_0053 solution_l_0053 = new Solution_l_0053();
        int[] now = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        solution_l_0053.maxSubArray(now);
    }
}
//11: 59
class Solution_l_0053 {
    public int maxSubArray(int[] nums) {
        int amountNow = 0;
        int maxSumNow = nums[0];
        for (int i = 0; i < nums.length; i++) {
            amountNow = amountNow + nums[i];
            if (amountNow < nums[i]) {
                amountNow = nums[i];
            }
            if (amountNow > maxSumNow) {
                maxSumNow = amountNow;
            }
        }
        return maxSumNow;
    }
}