package leetcode;

public class l_0704 {
    //[-1,0,5]
    //5
    public static void main(String[] args) {
        Solution_l_0704 solution_l_0704 = new Solution_l_0704();
        System.out.println(solution_l_0704.search(new int[]{-1, 0, 5}, 5));
    }
}

//12:15 12:39
class Solution_l_0704 {
    public int search(int[] nums, int target) {
        int pivot = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }
}