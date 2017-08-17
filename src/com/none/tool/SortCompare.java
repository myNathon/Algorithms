package com.none.tool;

import com.none.algorithm.sort.Insertion;
import com.none.algorithm.sort.Selection;

import java.util.Random;

import static com.none.tool.StdOut.printf;
import static com.none.tool.StdOut.println;

/**
 * 算法比较类实现
 * Created by Nathon on 2017/8/17.
 */
public class SortCompare {
    /**
     * 统计排序算法处理一次消耗时间
     * @param alg 算法对应标识
     * @param arr 目标数组
     * @return    消耗时间
     */
    public static double time(String alg, Comparable[] arr) {
        Stopwatch timer = new Stopwatch();
        switch(alg) {
            case "Selection":
                Selection.sort(arr);
                break;
            case "Insertion":
                Insertion.sort(arr);
                break;
            default:
                println("不识别算法标识符。");
                break;
        }

        return timer.elapsedTime();
    }

    /**
     * 一次随机填充N大小数组，统计T次排序时间
     * @param alg 算法对应标识
     * @param N   需要填充的数组大小
     * @param T   需要统计的次数
     * @return    总共消耗时间
     */
    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];

        // new Random and set seed
        Random r = new Random(System.currentTimeMillis());
        for(int t = 0; t < T; t++) {
            for(int n = 0; n < N; n++) {
                a[n] = r.nextDouble()*100; // [0, 100.0)
            }

            total += time(alg, a);
        }

        return total;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        int N = 10000;
        int T = 1000;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        printf("%s is %.1f times faster than %s\n", alg1, t2/t1, alg2);
    }
}
