package com.ntm.internal.converter;

import com.ntm.internal.converter.impl.OnesToWordConverterImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertUptoTwentyTest {

    @Test
    void convertNumberAsWord() {
        OnesConverter convertor=new OnesToWordConverterImpl();
       assertEquals(" Eleven" ,convertor.convertNumberAsWord(11).toString());
        assertEquals(" Thirteen" ,convertor.convertNumberAsWord(13).toString());
        assertEquals(" Twelve" ,convertor.convertNumberAsWord(12).toString());
        assertEquals(" Fourteen" ,convertor.convertNumberAsWord(14).toString());
        assertEquals(" Fifteen" ,convertor.convertNumberAsWord(15).toString());
        assertEquals(" Sixteen" ,convertor.convertNumberAsWord(16).toString());
        assertEquals(" Seventeen" ,convertor.convertNumberAsWord(17).toString());
        assertEquals(" Eighteen" ,convertor.convertNumberAsWord(18).toString());
        assertEquals(" Nineteen" ,convertor.convertNumberAsWord(19).toString());

        //Test Exception
        assertThrows(Exception.class ,()->convertor.convertNumberAsWord(20).toString());
    }
    @Test
    void convertNumberAsWordForSingleDigit() {
        OnesConverter convertor=new OnesToWordConverterImpl();
        assertEquals(" One" ,convertor.convertNumberAsWord(1).toString());
        assertEquals(" Two" ,convertor.convertNumberAsWord(2).toString());
        assertEquals(" Three" ,convertor.convertNumberAsWord(3).toString());
        assertEquals(" Four" ,convertor.convertNumberAsWord(4).toString());
        assertEquals(" Five" ,convertor.convertNumberAsWord(5).toString());
        assertEquals(" Six" ,convertor.convertNumberAsWord(6).toString());
        assertEquals(" Seven" ,convertor.convertNumberAsWord(7).toString());
        assertEquals(" Eight" ,convertor.convertNumberAsWord(8).toString());
        assertEquals(" Nine" ,convertor.convertNumberAsWord(9).toString());
    }
}