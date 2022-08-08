package com.ntm.internal.converter.impl;

import com.ntm.internal.converter.HundredConverter;
import static com.ntm.internal.constants.Constants.NUMBER_HUNDRED;
import static com.ntm.internal.constants.Constants.NUMBER_ZERO;

import com.ntm.internal.math.QuotientAndReminderFunction;
import com.ntm.internal.values.NumberToEnglishValues;

public class HundredToWordsConverter extends QuotientAndReminderFunction implements HundredConverter {

    @Override
    public StringBuilder convertNumberAsWord(int number, StringBuilder words) {

        if (  findQuotient(number, NUMBER_HUNDRED) > NUMBER_ZERO) {
            long hundredValue=findQuotient(number, NUMBER_HUNDRED) * NUMBER_HUNDRED;
           return words.insert(NUMBER_ZERO, NumberToEnglishValues.
                    getHundredValue(Math.toIntExact(hundredValue)));
        }
        return words;
    }
}
