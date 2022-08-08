package com.ntm.internal.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberToWordsTest {

    @Test
    void numberToWords() {
        ConvertNumberToWords convertNumberToWords=new ConvertNumberToWords();
       assertEquals("Zero",convertNumberToWords.numberToWords(00000));
        assertEquals("Five Hundred Eleven",convertNumberToWords.numberToWords(511));
        assertEquals("Nine",convertNumberToWords.numberToWords(9));
        assertEquals("One Hundred Eleven",convertNumberToWords.numberToWords(111));
        assertEquals("One Thousand Nine Hundred Ninety Nine",convertNumberToWords.numberToWords(1999));
        assertEquals("Ten Thousand Nine Hundred Ninety Nine",convertNumberToWords.numberToWords(10999));
        assertEquals("Twenty Two Billion Two Hundred Twenty Two Million Two Hundred Twenty Two Thousand Two Hundred Eleven"
                ,convertNumberToWords.numberToWords(22222222211L));
        //Exception Testing
        assertEquals("Not a Valid Number",convertNumberToWords.numberToWords(Long.MAX_VALUE));

    }


}