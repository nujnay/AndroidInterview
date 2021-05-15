package DynamicPrograming;

public class leetcode_63 {
    int[] nums = new int[]{2, 3, 1, 4, -1, -2};
    //遇到负数才会截断

}

class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);//确定不为负数
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}