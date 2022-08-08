package com.ntm.internal.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuotientAndReminderFunctionTest {

    @Test
    void findQuotient() {
        QuotientAndReminderFunction quotientAndReminderFunction=new QuotientAndReminderFunction();
        assertEquals(9,quotientAndReminderFunction.findQuotient(100,11));
        assertEquals(0,quotientAndReminderFunction.findQuotient(100,110));
        assertEquals(10,quotientAndReminderFunction.findQuotient(1000,100));
        assertEquals(0,quotientAndReminderFunction.findQuotient(0,100));
        assertEquals(125,quotientAndReminderFunction.findQuotient(12567,100));
        assertThrows(Exception.class,()->quotientAndReminderFunction.findQuotient(1000,0));
    }

    @Test
    void findReminder() {
        QuotientAndReminderFunction quotientAndReminderFunction=new QuotientAndReminderFunction();
        assertEquals(1,quotientAndReminderFunction.findReminder(100,11));
        assertEquals(100,quotientAndReminderFunction.findReminder(100,110));
        assertEquals(0,quotientAndReminderFunction.findReminder(1000,100));
        assertEquals(0,quotientAndReminderFunction.findReminder(0,100));
        assertEquals(67,quotientAndReminderFunction.findReminder(12567,100));
        assertThrows(Exception.class,()->quotientAndReminderFunction.findReminder(1000,0));
    }
}