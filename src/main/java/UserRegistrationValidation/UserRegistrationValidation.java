package UserRegistrationValidation;

import java.util.*;
@FunctionalInterface
interface UserRegistrationUtil
{
  public static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
  public static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
  public static final String EMAIL_PATTERN = "[a-z0-9]{3,15}(|[.]?[a-z0-9]+)@[a-z0-9]{1,15}(.[a-z]{2,4})(|[.]?[a-z]{2,4})";
  public static final String PHONE_PATTERN = "[0-9]{2,3}[\\s][0-9]{10}";
  public static final String PASSWORD_PATTERN = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
  public boolean match(String str);
  
}
public class UserRegistrationValidation
{
	UserRegistrationUtil firstNameValidator;
	UserRegistrationUtil lastNameValidator;
	UserRegistrationUtil emailValidator;
	UserRegistrationUtil phoneValidator;
	UserRegistrationUtil passwordValidator;
	
	public UserRegistrationValidation() {
		firstNameValidator = (input) -> input.matches(UserRegistrationUtil.FIRST_NAME_PATTERN);
		lastNameValidator = (input) -> input.matches(UserRegistrationUtil.LAST_NAME_PATTERN);
		emailValidator = (input) -> input.matches(UserRegistrationUtil.EMAIL_PATTERN);
		phoneValidator = (input) -> input.matches(UserRegistrationUtil.PHONE_PATTERN);
		passwordValidator = (input) -> input.matches(UserRegistrationUtil.PASSWORD_PATTERN);
	}
	
	public void handleInput(String printMessage, UserRegistrationUtil util) {
		
		System.out.print(printMessage + ": ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(util.match(input)){
			System.out.println("Valid " + printMessage);
		}
		else{
			System.out.println("Invalid " + printMessage);
		}
	}
	public static void main(String args[])
	{	
		
		UserRegistrationValidation validation = new UserRegistrationValidation();
		
		System.out.println("Welcome to User Registration");
		validation.handleInput("First Name", validation.firstNameValidator);
		validation.handleInput("Last Name", validation.lastNameValidator);
		validation.handleInput("Email", validation.emailValidator);
		validation.handleInput("Phone", validation.phoneValidator);
		validation.handleInput("Password", validation.passwordValidator);
	}
}