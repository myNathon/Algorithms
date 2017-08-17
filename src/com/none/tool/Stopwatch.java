package com.none.tool;

/**
 * 计时器（秒表）
 * Created by Nathon on 2017/8/17.
 */
public class Stopwatch {
    private final long start;

    /**
     * Initialization
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    /**
     * 统计创建对象到调用该方法所消耗时间(in seconds)
     * @return 消耗时间
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();

        return (now - start) / 1000.0;  // "/1000.0"
    }
}
