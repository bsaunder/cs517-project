/**
 * 
 */
package net.bryansaunders.dss.model.constraint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import net.bryansaunders.dss.dao.GenericDaoImpl;

import org.jboss.logging.Logger;

/**
 * Phone Number Constraint Validator. A Phone Number is Defined as any String
 * that matched the Regular Expression: {@value #PHONE_REGEX}.
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
	public boolean isValid(String value,
			ConstraintValidatorContext constraintContext) {
		this.logger.debug("Validating Phone Number: " + value);
		boolean isValid = false;

		if (value == null) {
			isValid = false;
		} else {
			final Pattern pattern = Pattern
					.compile(PhoneNumberValidator.PHONE_REGEX);
			final Matcher matcher = pattern.matcher(value);

			isValid = matcher.matches();
		}

		return isValid;
	}

}
