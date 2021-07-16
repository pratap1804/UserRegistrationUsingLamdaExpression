import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	 @Test
	    public void givenFirstName_ShouldHaveFirstCharacter_UpperCase_ShouldReturnTrue() throws UserException{
		 UserRegistration userregistration = new UserRegistration();  
		 String name = "Pratap";
	       
	        try {
	            boolean firstName = userregistration.validateFirstName(name);
	        } catch (UserException e){
	            Assert.assertEquals(UserException.ExceptionType.invalidFirstName, e.type);
	        }
	    }

	    @Test
	    public void givenFirstName_ShouldHaveFirstCharacter_UpperCase_OtherwiseShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	        String name = "pratap";
	        
	        try {
	            boolean firstName = userregistration.validateFirstName(name);
	        } catch (UserException e){
	            Assert.assertEquals(UserException.ExceptionType.invalidFirstName, e.type);
	        }
	    }

	    @Test
	    public void givenLastName_ShouldHaveFirstCharacter_UpperCase_ShouldReturnTrue()  {
	    	UserRegistration userregistration = new UserRegistration();
	        String name = "Pratap";
	        
	        try {
	            boolean lastName = userregistration.validateLastName(name);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidLastName, e.type);
	        }
	    }

	    @Test
	    public void givenLastName_ShouldHaveFirstCharacter_UpperCase_OtherwiseShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String name = "pratap";
	        
	    	try {
	            boolean lastName = userregistration.validateLastName(name);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidLastName, e.type);
	        }
	    }

	    @Test
	    public void givenEmailId_WhenItIsValid_ShouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String email = "abc.xyz@bl.co.in";
	        
	    	try {
	            boolean eMail = userregistration.validateEmailID(email);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidEmail, e.type);
	        }
	    }

	    @Test
	    public void givenEmailId_WhenItIsInvalid_ShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	        String email = "abc";
	        
	        try {
	            boolean eMail = userregistration.validateEmailID(email);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidEmail, e.type);
	        }
	    }

	    
	    @Test
	    public void givenMobileNumber_WhenItIsValid_ShouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String number = "91 8989156503";
	        
	    	try {
	            boolean mobileNumber = userregistration.validateMobileNumber(number);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidMobileNumber, e.type);
	        }
	    }
	    
	    @Test
	    public void givenMobileNumber_WhenItIsInvalid_ShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String number = "9919813";
	        
	    	try {
	            boolean mobileNumber = userregistration.validateMobileNumber(number);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidMobileNumber, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_WhenMinimum8CharactersProvided_ShouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "pratap1804";
	        
	    	try {
	            boolean passwordFirst = userregistration.validatePasswordRuleFirst(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_WhenMinimum8CharactersNotProvided_ShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "manali";
	        try {
	            boolean passwordFirst = userregistration.validatePasswordRuleFirst(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }

	    
	    @Test
	    public void givenPassword_ShouldHaveAtLeastOneUpperCase_SHouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "Shubhampratap";
	        
	    	try {
	            boolean passwordSecond = userregistration.validatePasswordRuleSecond(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }
	   
	    @Test
	    public void givenPassword_WhenNotContainingOneUpperCase_ShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "pratap1804";
	        
	    	try {
	            boolean passwordTwo = userregistration.validatePasswordRuleSecond(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_ShouldHaveAtLeastOneNumber_ShouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "Pratap18";
	        
	    	try {
	            boolean passwordThird= userregistration.validatePasswordRuleThird(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_WhenNotContainingOneNumber_ShouldReturnFalse() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "shubhampratap";
	        
	    	try {
	            boolean passwordThird = userregistration.validatePasswordRuleThird(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_ShouldHaveSpecialCharacter_ShouldReturnTrue() {
	    	UserRegistration userregistration = new UserRegistration();
	    	String password = "Pratap18@04";
	        
	    	try {
	            boolean passwordFourth = userregistration.validatePasswordRuleFourth(password);
	        } catch (UserException e) {
	            Assert.assertEquals(UserException.ExceptionType.invalidPassword, e.type);
	        }
	    }
}
