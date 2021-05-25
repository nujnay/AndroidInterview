package leetcode;

public class l_0035 {

}
//17:00 17:11
class Solution_l_0035 {
    public int searchInsert(int[] nums, int target) {
        boolean targetIsLargerThanNow = false;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                if (targetIsLargerThanNow) {
                    return i;
                }
            }
            if (target > nums[i]) {
                targetIsLargerThanNow = true;
            }
        }
        if (targetIsLargerThanNow) {
            return nums.length;
        } else {
            return 0;
        }
    }
}