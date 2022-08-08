package com.ntm.internal.converter.impl;

import com.ntm.internal.converter.HundredConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HundredToWordsConverterTest {

    @Test
    void convertNumberAsWord() {
        HundredConverter hundredConverter=new HundredToWordsConverter();
        StringBuilder stringBuilder=new StringBuilder();
       assertEquals(" Four Hundred",hundredConverter.convertNumberAsWord(400,stringBuilder).toString());
        stringBuilder=new StringBuilder();
        assertEquals(" Five Hundred",hundredConverter.convertNumberAsWord(500,stringBuilder).toString());
        stringBuilder=new StringBuilder();
        assertEquals(" Seven Hundred",hundredConverter.convertNumberAsWord(701,stringBuilder).toString());
    }
}