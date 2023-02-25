package org.antwalk.customvalidation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=PasswordConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
  public String message() default "The password must be 1234";
  public Class<?>[] groups() default {};
  public Class<? extends Payload>[] payload() default{};
}