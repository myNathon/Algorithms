package com.none.algorithm.basic;

/**
 * Greatest Common Divisor(GCD)
 * Created by Nathon on 2017/8/15.
 */
public class GCD {
    /**
     * 递归实现
     * @param q
     * @param p
     * @return
     */
    public static int gcd1(int q, int p) {
        if(p == 0) { return q; }

        return gcd1(p, q%p);
    }

    /**
     * 循环实现
     * @param q
     * @param p
     * @return
     */
    public static int gcd2(int q, int p) {
        while(p != 0) {
            int tmp = p;
            p = q % p;
            q = tmp;
        }

        return q;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(gcd1(124, 246));
        System.out.println(gcd2(124, 246));

        System.out.println(gcd1(124, 164));
        System.out.println(gcd2(124, 164));

        System.out.println(gcd1(124, 248));
        System.out.println(gcd2(124, 248));

        System.out.println(gcd1(124, 243));
        System.out.println(gcd2(124, 243));

        System.out.println(gcd1(124, 0));
        System.out.println(gcd2(124, 0));

        System.out.println(gcd1(0, 246));
        System.out.println(gcd2(0, 246));
    }
}
