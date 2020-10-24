package UserRegistrationValidation;
@FunctionalInterface
public interface UserRegistrationUtil {
	public static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
	public static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
	public static final String EMAIL_PATTERN = "[a-z0-9]{3,15}(|[.]?[a-z0-9]+)@[a-z0-9]{1,15}(.[a-z]{2,4})(|[.]?[a-z]{2,4})";
	public static final String PHONE_PATTERN = "[0-9]{2,3}[\\s][0-9]{10}";
	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
	public boolean match(String str);
}
