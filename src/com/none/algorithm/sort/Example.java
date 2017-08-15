package com.none.algorithm.sort;

/**
 * Sorting Algorithm Class Template
 * Created by Nathon on 2017/8/15.
 */
public class Example {
    /**
     * 需要实现的算法
     * @param arr 对象数组
     */
    public static void sort(Comparable[] arr) {
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            int min = i;
            for(int j = i; j < len; j++) {
                if(less(arr[j], arr[min])) { min = j; }
            }
            exch(arr, i, min);
        }
    }

    /**
     * 对象比较
     * @param src  源对象
     * @param obj  目标对象
     * @return  "src < obj" 返回 true; 否则 false
     */
    private static boolean less(Comparable src, Comparable obj) {
        return src.compareTo(obj) < 0;
    }

    /**
     * 对象交换
     * @param arr 对象数组
     * @param i   对象数组下标值
     * @param j   对象数组下标值
     */
    private static void exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 打印对象数组的各个元素
     * @param arr  对象数组
     */
    public static void show(Comparable[] arr) {
        for(Comparable a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**
     * 判断数组对象是否升序排序[可根据实际改成降序判断]
     * @param arr  对象数组
     * @return
     */
    public static boolean isSorted(Comparable[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(less(arr[i-1], arr[i])) { return true; }
        }

        return false;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        String[] a = new String[]{"n", "h", "k", "l", "d", "r", "u", "c", "m"};
        sort(a);
        if(!isSorted(a)) {
            System.out.println("排序不符合要求");
            System.exit(0);
        }
        show(a);
    }
}
