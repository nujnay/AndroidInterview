package leetcode;

public class l_0027 {
    public static void main(String[] args) {
        //Input: nums = [3,2,2,3], val = 3
        //Output: 2, nums = [2,2]
        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3]


    }
}

//11:05 11:10
class Solution_l_0027 {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0) {
            return 0;
        }
        int number = 0;
        int targetAppear = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            } else {
                nums[targetAppear] = nums[i];
                targetAppear++;
                number++;
            }
        }
        return number;
    }
}