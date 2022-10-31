package LeetCode75.level1;
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

 */
public class N1480 {
    public static void main(String[] args) {
        N1480 n1480 = new N1480();
        int[] result = n1480.runningSum(new int[]{1, 1, 1, 1});
        System.out.println(result);
    }
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        recursion(0, nums, result);
        return result;
    }

    public void recursion(int index, int[] origin, int[] result) {
        if (index == result.length) {
            return;
        }
        if (index == 0) {
            result[index] = origin[index];
        } else {
            int resultIndex = origin[index] + result[index - 1];
            result[index] = resultIndex;
        }
        recursion(index + 1, origin, result);
    }
}
