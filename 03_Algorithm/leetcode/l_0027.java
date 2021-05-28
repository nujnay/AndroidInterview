package leetcode;

public class l_0027 {
    public static void main(String[] args) {
        //[3,2,2,3]
        //[0,1,2,2,3,0,4,2]
    }
}

//11:04
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
            }
        }
    }
}