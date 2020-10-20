import java.util.*;
class UserRegistrationUtil
{
  public final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
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

    if(util.match(firstName, util.FIRST_NAME_PATTERN)){
      System.out.println("Valid First Name");
    }
    else{
        System.out.println("Invalid First Name");
    }
  }
}
