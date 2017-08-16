package com.none.algorithm.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nathon on 2017/8/16.
 */
class MySqrtTest {
    @Test
    void sqrt() {
        double r = MySqrt.sqrt(9.0);
        assertEquals(3.0, r, 1e-15);

        r = MySqrt.sqrt(2.0);
        assertEquals(Math.sqrt(2.0), r, 1e-15);

        r = MySqrt.sqrt(10.0);
        assertEquals(Math.sqrt(10.0), r, 1e-15);

        r = MySqrt.sqrt(100.0);
        assertEquals(Math.sqrt(100.0), r, 1e-15);
    }

}