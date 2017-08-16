package com.none.algorithm.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nathon on 2017/8/16.
 */
class GCDTest {
    @Test
    void gcd1() {
        int r = GCD.gcd1(124, 246);
        assertEquals(2, r);

        r = GCD.gcd1(124, 164);
        assertEquals(4, r);

        r = GCD.gcd1(124, 248);
        assertEquals(124, r);

        r = GCD.gcd1(124, 243);
        assertEquals(1, r);

        r = GCD.gcd1(124, 0);
        assertEquals(124, r);

        r = GCD.gcd1(0, 246);
        assertEquals(246, r);
    }

    @Test
    void gcd2() {
        int r = GCD.gcd2(124, 246);
        assertEquals(2, r);

        r = GCD.gcd2(124, 164);
        assertEquals(4, r);

        r = GCD.gcd2(124, 248);
        assertEquals(124, r);

        r = GCD.gcd2(124, 243);
        assertEquals(1, r);

        r = GCD.gcd2(124, 0);
        assertEquals(124, r);

        r = GCD.gcd2(0, 246);
        assertEquals(246, r);
    }
}