package UserRegistrationValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationValidationTest {
    // Validation Test for First name
    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.firstNameValidator.match("Rajat");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue1() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.firstNameValidator.match("Rakshit");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.firstNameValidator.match("PrabhaL");
        Assert.assertEquals(false,result);
    } 
    //Testing  Last name validation
    @Test
    public void givenLastName_IfValid_ShouldReturnTrue() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.lastNameValidator.match("Gundi");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_IfValid_ShouldReturnTrue1() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.lastNameValidator.match("Rajat");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.lastNameValidator.match("gundi");
        Assert.assertEquals(false,result);
    }
    // Validation Testing for Email Id
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.emailValidator.match("glrajat@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue1() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.emailValidator.match("raksh@mani.edu.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.emailValidator.match("Rajat");
        Assert.assertEquals(false,result);
    }
    // Validation Test for Mobile Pattern
    @Test
    public void givenPhoneNumber_IfValid_ShouldReturnTrue() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.phoneValidator.match("091 8496942482");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_IfValid_ShouldReturnTrue1() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.phoneValidator.match("912 6005008200");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.phoneValidator.match("300700600");
        Assert.assertEquals(false,result);
    }
    // Validation Test for Password
    @Test
    public void givenPassword_IfValid_ShouldReturnTrue() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.passwordValidator.match("Rajat@$20");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.passwordValidator.match("Rajat");
        Assert.assertEquals(false,result);
    }  
    @Test
    public void givenPassword_IfNotValid_ShouldReturnFalse1() {
    	UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean result = validation.passwordValidator.match("rajat@$20");
        Assert.assertEquals(false,result);
    }  
}