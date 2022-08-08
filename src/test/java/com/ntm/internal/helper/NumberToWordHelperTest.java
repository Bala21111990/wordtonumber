package com.ntm.internal.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordHelperTest {

    @Test
    void updateNumbertoPositive() {
        assertEquals(11,NumberToWordHelper.updateNumbertoPositive(-11));
        assertEquals(112,NumberToWordHelper.updateNumbertoPositive(-112));
        assertEquals(11,NumberToWordHelper.updateNumbertoPositive(11));
    }

    @Test
    void isNegativeNumber() {
        assertFalse(NumberToWordHelper.isNegativeNumber(0));
        assertTrue(NumberToWordHelper.isNegativeNumber(-11));
        assertFalse(NumberToWordHelper.isNegativeNumber(145678));
    }
}