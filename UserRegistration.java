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
}
public class UserRegistration
{
  public static void main(String args[])
  {
    UserRegistrationUtil util = new UserRegistrationUtil();
    System.out.println("Welcome to User Registration");
    System.out.print("First Name: ");
    Scanner sc = new Scanner(System.in);
    String firstName = sc.nextLine();
    if(util.match(firstName, UserRegistrationUtil.FIRST_NAME_PATTERN)){
      System.out.println("Valid First Name");
    }
    else{
      System.out.println("Invalid First Name");
    }
    System.out.print("Last Name: ");
    String lastName = sc.nextLine();
    if(util.match(lastName, UserRegistrationUtil.LAST_NAME_PATTERN)){
      System.out.println("Valid Last Name");
    }
    else{
      System.out.println("Invalid Last Name");
    }
    System.out.print("Email: ");
    String email = sc.nextLine();
    if(util.match(email, UserRegistrationUtil.EMAIL_PATTERN)){
      System.out.println("Valid Email");
    }
    else{
      System.out.println("Invalid Email");
    }
    System.out.print("Phone: ");
    String phone = sc.nextLine();
    if(util.match(phone, UserRegistrationUtil.PHONE_PATTERN)){
      System.out.println("Valid Phone");
    }
    else{
      System.out.println("Invalid Phone");
    }
    System.out.print("Password: ");
    String password = sc.nextLine();
    if(util.match(password, UserRegistrationUtil.PASSWORD_PATTERN)){
      System.out.println("Valid Password");
    }
    else{
      System.out.println("Invalid Password");
    }
  }
}
