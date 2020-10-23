package UserRegistrationValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationValidationTest {
    // Validation Test for First name
    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Rajat",UserRegistrationUtil.FIRST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue1() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Rakshit",UserRegistrationUtil.FIRST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue2() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Prabh",UserRegistrationUtil.FIRST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    } 
    //Testing  Last name validation
    @Test
    public void givenLastName_IfValid_ShouldReturnTrue() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Gundi",UserRegistrationUtil.LAST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_IfValid_ShouldReturnTrue1() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Grk",UserRegistrationUtil.LAST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_IfValid_ShouldReturnTrue2() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Labrador",UserRegistrationUtil.LAST_NAME_PATTERN);
        Assert.assertEquals(true,result);
    }
    // Validation Testing for Email Id
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("glrajat@gmail.com",UserRegistrationUtil.EMAIL_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue1() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("glshitkar@gscore.eu",UserRegistrationUtil.EMAIL_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue2() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("prab@gmail.co.in",UserRegistrationUtil.EMAIL_PATTERN);
        Assert.assertEquals(true,result);
    }
    // Validation Test for Mobile Pattern
    @Test
    public void givenPhoneNumber_IfValid_ShouldReturnTrue() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("091 8496942482",UserRegistrationUtil.PHONE_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_IfValid_ShouldReturnTrue1() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("123 1273476811",UserRegistrationUtil.PHONE_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_IfValid_ShouldReturnTrue2() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("1234 1273476811",UserRegistrationUtil.PHONE_PATTERN);
        Assert.assertEquals(false,result);
    }
    // Validation Test for Password
    @Test
    public void givenPassword_IfValid_ShouldReturnTrue() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("Rajat@420",UserRegistrationUtil.PASSWORD_PATTERN);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_IfNotValid_ShouldReturnFalse() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("RABDA123",UserRegistrationUtil.PASSWORD_PATTERN);
        Assert.assertEquals(false,result);
    }  
    @Test
    public void givenPassword_IfNotValid_ShouldReturnFalse1() {
    	UserRegistrationUtil userValidator = new UserRegistrationUtil();
        boolean result = userValidator.match("rajat@420",UserRegistrationUtil.PASSWORD_PATTERN);
        Assert.assertEquals(false,result);
    }  
}