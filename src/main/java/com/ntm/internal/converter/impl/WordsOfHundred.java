package com.ntm.internal.converter.impl;

import com.ntm.internal.constants.Constants;
import com.ntm.internal.converter.HundredConverter;
import com.ntm.internal.converter.OnesConverter;
import com.ntm.internal.converter.TensConvertor;
import com.ntm.internal.converter.WordConvertor;
import com.ntm.internal.math.QuotientAndReminderFunction;

public class WordsOfHundred extends QuotientAndReminderFunction implements WordConvertor {

    public final OnesConverter onesConvertor;
    public final TensConvertor tensConvertor;

    public final HundredConverter hundredConverter;

    public WordsOfHundred(OnesConverter onesConvertor,
                          TensConvertor tensConvertor,
                          HundredConverter hundredConverter) {
        this.onesConvertor = onesConvertor;
        this.tensConvertor = tensConvertor;
        this.hundredConverter = hundredConverter;
    }
    @Override
    public StringBuilder convertNumberAsWord(long number) {
        StringBuilder words ;
        int twoDigitReminder = findReminder(number, Constants.NUMBER_HUNDRED);
        if(twoDigitReminder < Constants.NUMBER_TWENTY){
            words= onesConvertor.convertNumberAsWord(twoDigitReminder);
        }
        else{
            words= tensConvertor.convertNumberAsWord(twoDigitReminder);
        }
        return hundredConverter.convertNumberAsWord((int) number,words);
    }
}
