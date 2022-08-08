package com.ntm.internal.converter;

import com.ntm.internal.converter.impl.TensToWordConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TensConvertorTest {

    @Test
    void convertNumberAsWord() {
        TensConvertor convertor=new TensToWordConverter();
        assertEquals(" Ninety Nine",convertor.convertNumberAsWord(99).toString());
        assertEquals(" Twenty One",convertor.convertNumberAsWord(21).toString());
        assertEquals(" Forty Five",convertor.convertNumberAsWord(45).toString());
        assertEquals(" Twenty",convertor.convertNumberAsWord(20).toString());
        //Should Throw Exception
        assertThrows(Exception.class,()->convertor.convertNumberAsWord(19).toString());
        //Should Throw Exception
        assertThrows(Exception.class,()->convertor.convertNumberAsWord(1000).toString());
    }
}