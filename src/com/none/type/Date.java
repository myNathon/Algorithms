package com.none.type;

/**
 * 实现Comparable接口的日期类，并覆写toString()方法
 * Created by Nathon on 2017/8/16.
 */
public class Date implements Comparable<Date> {
    private final int day;
    private final int month;
    private final int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1999;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }

    @Override
    public int compareTo(Date that) {
        if(this.year > that.year) { return 1; }
        else if(this.year < that.year) { return -1; }
        else if(this.month > that.month) { return 1; }
        else if(this.month < that.month) { return -1; }
        else if(this.day > that.day) { return 1; }
        else if(this.day < that.day) { return -1; }
        return 0;
    }
}
