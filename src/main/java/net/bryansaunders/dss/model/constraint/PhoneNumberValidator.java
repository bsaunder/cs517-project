/**
 * 
 */
package net.bryansaunders.dss.model.constraint;

import java.util.regex.PatternSyntaxException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import net.bryansaunders.dss.dao.GenericDaoImpl;

import org.jboss.logging.Logger;

/**
 * Phone Number Constraint Validator. A Phone Number is Defined as any String that matched the Regular Expression: {@value #PHONE_REGEX}.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class PhoneNumberValidator implements
		ConstraintValidator<PhoneNumber, String> {

	private static final String PHONE_REGEX = "\\(?[0-9]{3}\\)?[-. ]?[0-9]{3}[-. ]?[0-9]{4}";

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(GenericDaoImpl.class);

	/**
	 * {@inheritDoc}
	 */
	public void initialize(PhoneNumber constraintAnnotation) {
		// Nothing To Do.
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isValid(String object,
			ConstraintValidatorContext constraintContext) {
		boolean isValid = false;

		try {
			isValid = object.matches(PhoneNumberValidator.PHONE_REGEX);
		} catch (PatternSyntaxException ex) {
			this.logger.error(ex);
		}

		return isValid;
	}

}
