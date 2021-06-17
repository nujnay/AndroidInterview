package leetcode;

public class l_0033 {
    public static void main(String[] args) {
        Solution_l_0033 solution_l_0033 = new Solution_l_0033();
        System.out.println(solution_l_0033.search(new int[]{1, 2, 3, 4}, 3));
    }
}

class Solution_l_0033 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}