package DynamicPrograming;

public class leetcode_63 {
    int[] nums = new int[]{1, -1, 2, 3, -4};
    //遇到负数才会截断

}

class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            //只要不为负数就是所有的数累加，如果此时的
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}