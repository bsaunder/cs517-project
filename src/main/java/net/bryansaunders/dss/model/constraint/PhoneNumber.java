/**
 * 
 */
package net.bryansaunders.dss.model.constraint;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Phone Number Validation Constraint Annotation. Uses the PhoneNumberValidator
 * Class.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
@Documented
public @interface PhoneNumber {

	String message() default "{net.bryansaunders.dss.phoneNumber}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
