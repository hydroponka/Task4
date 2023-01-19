package by.ageenko.task_4.validator.impl;

import by.ageenko.task_4.validator.StringValidator;

public class StringValidatorImpl implements StringValidator {
    private static final String INT_NUMBER_REGEX = "\\d+";
    private static final String STRING_TEXT_REGEX = "\\D+";

    @Override
    public boolean stringNumberValidate(String stringNum) {
        boolean match = stringNum.matches(INT_NUMBER_REGEX);
        return match;
    }

    @Override
    public boolean stringTextValidate(String stringText) {
        boolean match = stringText.matches(STRING_TEXT_REGEX);
        return match;
    }
}


