package com.masivian.roulette.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TextValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateText {

    String[] acceptedValues();

    String message() default "Error";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}