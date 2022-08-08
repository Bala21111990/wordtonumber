package com.ntm.internal.helper;

import com.ntm.internal.constants.Constants;

/**
 * Helper Class
 */
public class NumberToWordHelper {

    private NumberToWordHelper (){
        throw new IllegalAccessError("Util Class");
    }

    public static long updateNumbertoPositive(long number){
        //Check Number is Negative . If it is Negative Convert into Positive For processing
        if(isNegativeNumber(number)){
            return number * -Constants.NUMBER_ONE;
        }
        return number;
    }

    public static boolean isNegativeNumber(long number){
       return  number < Constants.NUMBER_ZERO;
    }
}
