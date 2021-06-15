package leetcode;

public class l_0209 {
}

//09:41
class Solution_l_0209 {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
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