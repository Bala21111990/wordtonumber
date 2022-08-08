package com.ntm.internal.converter.impl;

import com.ntm.internal.converter.WordConvertor;
import com.ntm.internal.constants.Constants;
import com.ntm.internal.validator.InputValidation;
import com.ntm.internal.math.QuotientAndReminderFunction;

import static com.ntm.internal.helper.NumberToWordHelper.isNegativeNumber;
import static com.ntm.internal.helper.NumberToWordHelper.updateNumbertoPositive;
import static com.ntm.internal.values.NumberToEnglishValues.getThousandValue;

public class NumbertoWordConverter extends QuotientAndReminderFunction implements WordConvertor {

    public final WordConvertor convertToWord;

    public NumbertoWordConverter(WordConvertor convertToWord) {
        this.convertToWord = convertToWord;
    }


    @Override
    public StringBuilder convertNumberAsWord(long inputNumber) {
        int thousandValue = 0;
        StringBuilder words = new StringBuilder();
        if (InputValidation.hasValidateInput(inputNumber)) {
            boolean isNegative=isNegativeNumber(inputNumber);
           inputNumber= updateNumbertoPositive(inputNumber);
           if(inputNumber==Constants.NUMBER_ZERO)
               return words.append(Constants.STR_ZERO);
            do {
                convertToWord(inputNumber,words,thousandValue);
                thousandValue++;
                inputNumber = findQuotient(inputNumber, Constants.NUMBER_THOUSAND);
            } while (inputNumber > 0);
            return isNegative?words.insert(Constants.NUMBER_ZERO,Constants.MINUS):words;
        }
        throw new IllegalArgumentException(Constants.NUMBER_NOT_VALID);
    }

    private void convertToWord(long inputNumber, StringBuilder words, int thousandValue) {
        int threeDigitReminder = findReminder(inputNumber, Constants.NUMBER_THOUSAND);
        if (threeDigitReminder != Constants.NUMBER_ZERO) {
            words.insert(Constants.NUMBER_ZERO, getThousandValue(thousandValue));
            words.insert(Constants.NUMBER_ZERO, convertToWord.convertNumberAsWord(threeDigitReminder));
        }
    }
}
