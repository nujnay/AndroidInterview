package Microsoft.chapter_e;

public class M_e_01 {
    int[] test1 = new int[]{1, 1, 2, 2, 3};
    int[] test2 = new int[]{1, 2, 3};

}
//14:20-14:31
class Solution_M_e_01 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int now = nums[0];
        int sum = 1;
        int indexFront = 0;
        int indexBack = 0;
        for (int i = 0; i < nums.length; i++) {
            //一样的话
            if (now == nums[indexBack]) {
                indexBack++;
            } else {
                indexFront = indexFront + 1;
                nums[indexFront] = nums[indexBack];
                now = nums[indexFront];
                indexBack++;
                sum++;
            }
        }
        return sum;
    }
}