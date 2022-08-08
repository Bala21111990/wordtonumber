package com.ntm.internal.converter.impl;

import com.ntm.internal.converter.WordConvertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbertoWordConverterTest {

    @Test
    void convertNumberAsWord() {

       assertEquals(" One Hundred",getNumbertoWordObject().convertNumberAsWord(100).toString());
        assertEquals(" One",getNumbertoWordObject().convertNumberAsWord(1).toString());
        assertEquals(" Eighty Nine",getNumbertoWordObject().convertNumberAsWord(89).toString());
        assertEquals(" Nine Hundred Fifty Seven",getNumbertoWordObject().convertNumberAsWord(957).toString());
        assertEquals(" Seventy Six Million Three Hundred One Thousand Sixty Four",getNumbertoWordObject().convertNumberAsWord(76301064).toString());
        assertEquals(" One Billion Seventy Six Million Three Hundred One Thousand Sixty Four",getNumbertoWordObject().convertNumberAsWord(1076301064).toString());
        assertEquals(" minus One Billion Seventy Six Million Three Hundred One Thousand Sixty Four",getNumbertoWordObject().convertNumberAsWord(-1076301064).toString());
    }


    private NumbertoWordConverter getNumbertoWordObject(){
        WordConvertor integerConvertor =new WordsOfHundred(new OnesToWordConverterImpl(),
                new TensToWordConverter(), new HundredToWordsConverter());
        return new NumbertoWordConverter(integerConvertor);
    }
}