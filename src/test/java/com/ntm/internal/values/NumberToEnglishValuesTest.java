package com.ntm.internal.values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToEnglishValuesTest {

    @Test
    void getSingleDigitValue() {
        assertEquals(" One",NumberToEnglishValues.getSingleDigitValue(1));
        assertEquals(" Two",NumberToEnglishValues.getSingleDigitValue(2));
        assertEquals(" Five",NumberToEnglishValues.getSingleDigitValue(5));
        assertEquals(" Seven",NumberToEnglishValues.getSingleDigitValue(7));
        assertEquals(null,NumberToEnglishValues.getSingleDigitValue(10));
    }

    @Test
    void getHundredValue() {
        assertEquals(" One Hundred",NumberToEnglishValues.getHundredValue(100));
        assertEquals(" Four Hundred",NumberToEnglishValues.getHundredValue(400));
        assertEquals(" Five Hundred",NumberToEnglishValues.getHundredValue(500));
        assertEquals(null,NumberToEnglishValues.getHundredValue(101));
    }

    @Test
    void getTwoDigitValue() {
        assertEquals(" Eleven",NumberToEnglishValues.getTwoDigitValue(11));
        assertEquals(" Twelve",NumberToEnglishValues.getTwoDigitValue(12));
        assertEquals(" Fifteen",NumberToEnglishValues.getTwoDigitValue(15));
        assertEquals(null,NumberToEnglishValues.getTwoDigitValue(45));
    }

    @Test
    void getTensValue() {
        assertEquals(" Twenty",NumberToEnglishValues.getTensValue(20));
        assertEquals(" Thirty",NumberToEnglishValues.getTensValue(30));
        assertEquals(" Ninety",NumberToEnglishValues.getTensValue(90));
        assertEquals(" Forty",NumberToEnglishValues.getTensValue(40));
        assertEquals(null,NumberToEnglishValues.getTensValue(45));
    }

    @Test
    void getThousandValue() {

        assertEquals(" Thousand",NumberToEnglishValues.getThousandValue(1));
        assertEquals(" Million",NumberToEnglishValues.getThousandValue(2));
        assertEquals(" Billion",NumberToEnglishValues.getThousandValue(3));
        assertEquals(" Trillion",NumberToEnglishValues.getThousandValue(4));
        assertEquals(" Quadrillion",NumberToEnglishValues.getThousandValue(5));
        assertEquals(" Quadrillion",NumberToEnglishValues.getThousandValue(5));

    }
}