package com.ntm.internal.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidationTest {


 @Test
 void testHasValidateInput() {
  assertTrue(InputValidation.hasValidateInput(2789L));
  assertTrue(InputValidation.hasValidateInput(-2789L));
  assertFalse(InputValidation.hasValidateInput(Long.MAX_VALUE));
  assertFalse(InputValidation.hasValidateInput(Long.MIN_VALUE));
 }
}