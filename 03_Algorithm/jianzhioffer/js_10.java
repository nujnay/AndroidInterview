package jianzhioffer;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-13 21:28
 **/
public class js_10 {
    public static void main(String[] args) {
        Solution_js_10 solution_js_10 = new Solution_js_10();
        Solution_js_10_2 Solution_js_10_2 = new Solution_js_10_2();
        System.out.println(solution_js_10.fib(50));
        System.out.println(Solution_js_10_2.fib(50));

    }
}

/**
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
class Solution_js_10 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib1(2, n, 1, 0);
    }

    public int fib1(int now, int n, int last, int lastlast) {
        if (now == n) {
            return (last % 1000000007 + lastlast % 1000000007) % 1000000007;
        }
        return fib1(now + 1, n, (last + lastlast) % 1000000007, last % 1000000007);
    }
}

class Solution_js_10_2 {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}