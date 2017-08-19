package com.none.tool;

import org.junit.jupiter.api.Test;

import static com.none.tool.StdOut.printf;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 排序算法比较
 * Created by Nathon on 2017/8/18.
 */
class SortCompareTest {
    @Test
    void compareSort() {
        // 注意："Quick3way" 针对数组重复元素较多情况会优于一般的 "Quick"
        String[] algs = new String[]{
                "Insertion", "Selection", "Shell",
                "Merge", "MergeBU", "Quick", "Quick3way"
        };
        int N = 1000;
        int T = 100;

        compareSort(algs, N, T);
    }

    /**
     * 时间估值测试
     * @param algs 排序方法标识
     * @param N    需要填充的数组大小
     * @param T    需要统计的次数
     */
    private void compareSort(String[] algs, int N, int T) {
        Stopwatch stopwatch = new Stopwatch();
        double sortElapsed = 0.0;
        for(String alg: algs) {
            double time = SortCompare.timeRandomInput(alg, N, T);
            printf("%s\tis %.1f times.\n", alg, time);

            sortElapsed += time;
        }

        double total = stopwatch.elapsedTime();
        // 不做估值判断，数组长度和比较次数会有影响
//        assertEquals(total, sortElapsed, 0.3);  // Deviation 0.3
    }
}