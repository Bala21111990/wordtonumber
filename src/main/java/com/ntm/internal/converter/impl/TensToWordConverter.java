package com.ntm.internal.converter.impl;

import com.ntm.internal.converter.TensConvertor;
import com.ntm.internal.math.QuotientAndReminderFunction;

import static com.ntm.internal.constants.Constants.*;
import static com.ntm.internal.values.NumberToEnglishValues.getSingleDigitValue;
import static com.ntm.internal.values.NumberToEnglishValues.getTensValue;

public class TensToWordConverter extends QuotientAndReminderFunction implements TensConvertor {
    @Override
    public StringBuilder convertNumberAsWord( int number) {
       if(number < NUMBER_HUNDRED && number > NUMBER_NINETEEN ) {
           int twoDigitRemider = findReminder(number, NUMBER_HUNDRED);
           StringBuilder stringBuilder = new StringBuilder();
           int singleDigitValue = findReminder(twoDigitRemider, NUMBER_TEN);
           int tensValue = (int) (findQuotient(twoDigitRemider, NUMBER_TEN) * NUMBER_TEN);
           stringBuilder.append(getTensValue(tensValue))
                   .append(getSingleDigitValue(singleDigitValue));
           return stringBuilder;
       }
       throw new IllegalArgumentException(NUMBER_NOT_VALID);
    }
}
