package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String codeFromUser, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;

        if (codeFromUser != null) {
            result = codeFromUser.startsWith(coursePrefix);
        }
        return result;
    }
}
