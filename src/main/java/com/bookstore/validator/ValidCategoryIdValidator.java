package com.bookstore.validator;

import com.bookstore.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Locale;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCayegoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext) {
        return category!=null && category.getId()!=null;
    }
}
