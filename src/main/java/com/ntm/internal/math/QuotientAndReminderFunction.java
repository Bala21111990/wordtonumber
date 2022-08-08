package com.ntm.internal.math;

public class QuotientAndReminderFunction implements QuotientFunction,ReminderFunction {
    @Override
    public Long findQuotient(long a, int b) {
        return  a / b;
    }

    @Override
    public int findReminder(long a, int b) {
        return  Math.toIntExact(a % b);
    }
}
