package leetcode;

public class l_0088 {
}
class Solution_l_0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int oneIndex = 0;
        int twoIndex = 0;
        //可以先放到尾部
        for (int i = 0; i < nums1.length; i++) {
            int oneContent = nums1[oneIndex];
            int twoContent = nums2[twoIndex];
            if (oneContent == twoContent) {

            } else if (oneContent > twoContent) {
                nums1[i] = twoContent;
            } else {

            }

        }
    }
}