package Microsoft;

public class Test_01 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{1, 2, 3};
        for (int i : solution.twoSum(a, 4)) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //拿出第一个和后面相加比较
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}

class Solution_01_02 {
    public int[] twoSum(int[] nums, int target) {
        //拿出第一个和后面相加比较
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}