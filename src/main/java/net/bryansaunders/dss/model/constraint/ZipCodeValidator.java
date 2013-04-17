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
 * Zip Code Constraint Validator. A Zip Code is Defined as any String that
 * matched the Regular Expression: {@value #ZIP_REGEX}.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {

	private static final String ZIP_REGEX = "\\b[0-9]{5}(?:-[0-9]{4})?\\b";

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(GenericDaoImpl.class);

	/**
	 * {@inheritDoc}
	 */
	public void initialize(ZipCode constraintAnnotation) {
		// Nothing To Do.
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isValid(String value,
			ConstraintValidatorContext constraintContext) {
		this.logger.debug("Validating Zip Code: " + value);
		boolean isValid = false;

		if (value == null) {
			isValid = false;
		} else {
			final Pattern pattern = Pattern.compile(ZipCodeValidator.ZIP_REGEX);
			final Matcher matcher = pattern.matcher(value);

			isValid = matcher.matches();
		}

		return isValid;
	}

}
