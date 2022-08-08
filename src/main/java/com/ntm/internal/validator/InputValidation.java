package com.ntm.internal.validator;

import java.util.Optional;

/**
 * Validate the Given Input
 */
public class InputValidation {
    public static boolean hasValidateInput(long number){
        return number < Long.MAX_VALUE && number > Long.MIN_VALUE;
    }


}

