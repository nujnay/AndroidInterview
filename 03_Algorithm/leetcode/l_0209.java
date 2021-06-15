package leetcode;

public class l_0209 {
    public static void main(String[] args) {
        //11
        //[1,2,3,4,5]
        Solution_l_0209 solution_l_0209 = new Solution_l_0209();
        System.out.println(solution_l_0209.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }
}

//09:41-10:09
class Solution_l_0209 {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == target) {
                    if (j - i + 1 < min) {
                        min = j - i + 1;
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}