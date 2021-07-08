package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-08 11:42
 **/
//11:40
public class l_202 {
    public static void main(String[] args) {
        Solution_l_202 solution_l_202 = new Solution_l_202();
        System.out.println(solution_l_202.isHappy(2));
    }
}

class Solution_l_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return next(n,  set);
    }

    public boolean next(int ori,  HashSet<Integer> set) {
        if (ori == 1) {
            return true;
        }
        int sum = getSum(ori);
        if (set.contains(sum)) {
            return false;
        } else {
            set.add(sum);
        }
        return next(sum, set);
    }

    public int getSum(int n) {
        int now = n;
        int last = 0;
        int sum = 0;
        do {
            last = n % 10;
            sum = sum + last * last;
            n = n / 10;
            System.out.println(now + "::" + last);
        } while (n != 0);
        return sum;
    }

}