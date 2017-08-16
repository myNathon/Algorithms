package com.none.algorithm.basic;

/**
 * Calculate the square root
 * Created by Nathon on 2017/8/15.
 */
public class MySqrt {
    /**
     * 利用牛顿迭代法计算平方根
     *    牛顿迭代法: Xn+1 = Xn - f(Xn)/f'(Xn)
     * @param N
     * @return
     */
    public static double sqrt(double N) {
        double con = 1e-15;
        double t = N;
        while(t - N/t > con * t) {
            t = (t + N/t) / 2.0;
        }

        return t;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sqrt(9.0));

        System.out.println(sqrt(2.0));

        System.out.println(sqrt(10.0));

        System.out.println(sqrt(100.0));
    }
}
