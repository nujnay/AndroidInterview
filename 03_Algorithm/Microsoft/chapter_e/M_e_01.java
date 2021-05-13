package Microsoft.chapter_e;

public class M_e_01 {
}
//13:55
class Solution_M_e_01 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int now = nums[0];
        int sum = 1;
        int indexFront = 0;
        int indexBack = 0;
        boolean firstSame = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != now) {
                now = nums[i];
                sum++;
                indexBack++;
                indexFront++;
            } else {
                if (firstSame) {
                    firstSame = true;
                } else {

                }
            }

        }
        return sum;
    }
}