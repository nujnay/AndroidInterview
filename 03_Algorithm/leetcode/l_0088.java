package leetcode;

public class l_0088 {
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //[1,2,3,0,0,0]
    //[2,5,6]
    //Output: [1,2,2,3,5,6]
}

class Solution_l_0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int indexSorted = 0;
        while (index1 < m || index2 < n) {
            int one = index1 < m ? nums1[index1] : Integer.MAX_VALUE;
            int two = index2 < n ? nums2[index2] : Integer.MAX_VALUE;
            if (one > two) {
                sorted[indexSorted] = nums2[index2];
                index2 = index2 + 1;
            } else {
                sorted[indexSorted] = nums1[index1];
                index1 = index1 + 1;
            }
            indexSorted = 1 + indexSorted;
        }
        for (int i = 0; i < sorted.length; i++) {
            nums1[i] = sorted[i];
        }
    }
}