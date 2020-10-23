package UserRegistrationValidation;

import java.util.*;
class UserRegistrationUtil
{
  public static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
  public static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
  public static final String EMAIL_PATTERN = "[a-z0-9]{3,15}(|[.]?[a-z0-9]+)@[a-z0-9]{1,15}(.[a-z]{2,4})(|[.]?[a-z]{2,4})";
  public static final String PHONE_PATTERN = "[0-9]{2,3}[\\s][0-9]{10}";
  public static final String PASSWORD_PATTERN = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
  public boolean match(String str, String pattern){
    return str.matches(pattern);
  }
  public void handleInput(String pattern, String printMessage) {
	  
	  System.out.print(printMessage + ": ");
	  Scanner sc = new Scanner(System.in);
	  String input = sc.nextLine();
	  if(match(input, pattern)){
	    System.out.println("Valid " + printMessage);
	  }
	  else{
	    System.out.println("Invalid " + printMessage);
	  }
//	  sc.close();
  }
}
public class UserRegistrationValidation
{
  public static void main(String args[])
  {
    UserRegistrationUtil util = new UserRegistrationUtil();
    System.out.println("Welcome to User Registration");

    util.handleInput(UserRegistrationUtil.FIRST_NAME_PATTERN, "First Name");
    util.handleInput(UserRegistrationUtil.LAST_NAME_PATTERN, "Last Name");
    util.handleInput(UserRegistrationUtil.EMAIL_PATTERN, "Email");
    util.handleInput(UserRegistrationUtil.PHONE_PATTERN, "Phone");
    util.handleInput(UserRegistrationUtil.PASSWORD_PATTERN, "Password");
  }
}