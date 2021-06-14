package leetcode;

public class l_0704 {
    //[-1,0,5]
    //5
    public static void main(String[] args) {
        Solution_l_0704 solution_l_0704 = new Solution_l_0704();
        System.out.println(solution_l_0704.search(new int[]{-1,0,5}, 5));
    }
}

//12:15 12:39
class Solution_l_0704 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int half = nums.length / 2;
        int startIndex = 0;
        int endIndex = nums.length - 1;
        boolean next = true;
        while (next) {
            if (nums[half] == target) {
                return half;
            }
            if (nums[half] > target) {
                endIndex = half;
                half = (half - startIndex) / 2 + startIndex;
                if (startIndex > half) {
                    next = false;
                }
                if (endIndex == half) {
                    if (nums[half] == target) {
                        return half;
                    } else {
                        next = false;
                    }
                }
            }
            if (nums[half] < target) {
                startIndex = half;
                half = (endIndex - half) / 2 + startIndex;
                if (endIndex < half) {
                    next = false;
                }
                if (startIndex == half) {
                    if (nums[half] == target) {
                        return half;
                    } else {
                        next = false;
                    }
                }
            }
        }
        return -1;
    }
}