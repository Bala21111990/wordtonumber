package com.ntm.internal.converter.impl;

import com.ntm.internal.constants.Constants;
import com.ntm.internal.converter.OnesConverter;
import com.ntm.internal.math.QuotientAndReminderFunction;

import static com.ntm.internal.values.NumberToEnglishValues.getSingleDigitValue;
import static com.ntm.internal.values.NumberToEnglishValues.getTwoDigitValue;
public class OnesToWordConverterImpl
        extends QuotientAndReminderFunction implements OnesConverter {
    @Override
    public  StringBuilder convertNumberAsWord(int number) {
        if (number < Constants.NUMBER_TWENTY) {
                       StringBuilder words = new StringBuilder();
            if (number < Constants.NUMBER_TEN) {
                words.append(getSingleDigitValue(number));
            } else {
                int reminder = findReminder(number, Constants.NUMBER_TEN) + Constants.NUMBER_TEN;
                words.append(getTwoDigitValue(reminder));
            }
            return words;
        }
        throw new IllegalArgumentException(Constants.NUMBER_NOT_VALID);
    }
}


