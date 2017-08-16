package com.none.algorithm.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nathon on 2017/8/16.
 */
class BinarySearchTest {
    @Test
    void rank() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int r = BinarySearch.rank(1, a);
        assertEquals(0, r);

        r = BinarySearch.rank(5, a);
        assertEquals(4, r);

        r = BinarySearch.rank(10, a);
        assertEquals(9, r);

        r = BinarySearch.rank(0, a);
        assertEquals(-1, r);

        r = BinarySearch.rank(11, a);
        assertEquals(-1, r);

        r = BinarySearch.rank(100, a);
        assertEquals(-1, r);
    }

}