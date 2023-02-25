package org.antwalk.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrgNameConstraintValidator implements ConstraintValidator<OrgName,String>{

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=value.contains("NRIFINTECH");
		return result;
	}

}