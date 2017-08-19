package com.none.algorithm.sort;

import com.none.type.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nathon on 2017/8/19.
 */
class Quick3wayTest {
    @Test
    void sort() {
        Integer[] a = new Integer[]{1, 4, 6, 8, 2, 4, 23, 45, 43, 12};
        Quick3way.sort(a);
//        Quick3way.show(a);
        Integer[] tmp = new Integer[]{1, 2, 4, 4, 6, 8, 12, 23, 43, 45};
        assertArrayEquals(tmp, a);
        assertTrue(Quick3way.isSorted(a));

        Date[] a2 = new Date[]{
                new Date(1, 2, 2017),
                new Date(2, 2, 2017),
                new Date(3, 3, 2017),
                new Date(28, 5, 2017),
                new Date(30, 12, 2016),
                new Date(30, 12, 2017),
                new Date(23, 8, 2017),
                new Date(23, 9, 2017),
                new Date(23, 5, 2017),
                new Date(30, 12, 2018),
                new Date(23, 9, 2018)
        };
//        Quick3way.show(a2);
        Quick3way.sort(a2);
//        Quick3way.show(a2);
        assertTrue(Quick3way.isSorted(a2));
    }

    @Test
    void show() {

    }

    @Test
    void isSorted() {
        Integer[] a = new Integer[]{1, 4, 6, 8, 2, 4, 23, 45, 43, 12};
        assertFalse(Quick3way.isSorted(a));

        a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 16, 17};
        assertTrue(Quick3way.isSorted(a));
    }

}