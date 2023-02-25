package org.antwalk.customvalidation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=OrgNameConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OrgName {
  public String message() default "The name of the Organisation is not NriFintech";
  public Class<?>[] groups() default {};
  public Class<? extends Payload>[] payload() default{};
}