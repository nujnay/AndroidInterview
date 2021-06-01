package leetcode;

public class l_0053 {
    //[5,4,-1,7,8]
}
//11: 59
class Solution_l_0053 {
    public int maxSubArray(int[] nums) {
        int amountNow = 0;
        int maxSumNow = 0;
        for (int i = 0; i < nums.length; i++) {
            int oldAmount = amountNow;
            amountNow = amountNow + nums[i];
            if (amountNow < oldAmount) {
                amountNow = oldAmount;
            }
            if (amountNow > maxSumNow) {
                maxSumNow = amountNow;
            }
        }
        return maxSumNow;
    }
}