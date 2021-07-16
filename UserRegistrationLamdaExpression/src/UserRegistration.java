import java.util.List;
import java.util.regex.Pattern;

interface ValidateFunction {
    boolean validate(String pattern, String userInput);
}

public class UserRegistration {

	 	String firstNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
	    String lastNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
	 
	    String emailPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	    
	    String mobilePattern = "((91){1})[ ]([98765]{1})([0-9]{9})$";
	    
	    String passwordFirstRule = "[a-zA-z]{8,32}$";
	    String passwordSecondRule = "(?=.*[A-Z])[a-zA-Z]{8,32}$";
	    String passwordThirdRule = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,32}$";
	    String passwordFourthRule = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!?#$]{1})[a-zA-Z0-9!?#$]{8,32}$";
	    
	    String sampleEmailPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

	    ValidateFunction lambdaPattern = (userInput, pattern) -> {
	       boolean result = Pattern.matches(pattern,userInput);
	                return result;
	    };

	    private boolean lambdaPattern(String userInput, String pattern){
	        return true;
	    }


	    public boolean validateFirstName(String firstName) throws UserException {
	        if(lambdaPattern(firstName, firstNamePattern)) {
	            return true;
	        } else{
	            throw new UserException("Invalid first name: ", UserException.ExceptionType.invalidFirstName);
	        }
	    }

	    public boolean validateLastName(String lastName) throws UserException {
	       if(lambdaPattern(lastName,lastNamePattern)) {
	            return true;
	        } else {
	            throw new UserException("Invalid last name: ", UserException.ExceptionType.invalidLastName);
	        }
	    }

	    public boolean validateEmailID(String emailID) throws UserException {
	      if( lambdaPattern(emailID, emailPattern)) {
	        return true;
	        } else {
	            throw new UserException("Invalid email: ", UserException.ExceptionType.invalidEmail);
	        }
	    }

	    public boolean validateMobileNumber(String mobileNumber) throws UserException {
	     if( lambdaPattern(mobileNumber, mobilePattern)) {
	            return true;
	        } else {
	            throw new UserException("Invalid mobile number: ", UserException.ExceptionType.invalidMobileNumber);
	        }
	    }

	    public boolean validatePasswordRuleFirst(String passwordFirst) throws UserException {
	          if(lambdaPattern(passwordFirst, passwordFirstRule)) {
	            return true;
	        } else {
	            throw new UserException("Invalid password: ", UserException.ExceptionType.invalidPassword);
	        }

	    }

	    public boolean validatePasswordRuleSecond(String passwordSecond) throws UserException  {
	        if(lambdaPattern(passwordSecond, passwordSecondRule)) {
	            return true;
	        } else {
	            throw new UserException("Invalid password: ", UserException.ExceptionType.invalidPassword);
	        }
	    }

	    public boolean validatePasswordRuleThird(String passwordThird) throws UserException {
	            if(lambdaPattern(passwordThird, passwordThirdRule)) {
	              return true;
	        } else {
	                throw new UserException("Invalid password: ", UserException.ExceptionType.invalidPassword);
	            }
	        }

	    public boolean validatePasswordRuleFourth(String passwordFourth) throws UserException {

	        if(lambdaPattern(passwordFourth, passwordFourthRule)) {
	            return true;
	        } else {
	            throw new UserException("Invalid password: ", UserException.ExceptionType.invalidPassword);
	        }
	    }

	    public boolean validateSampleEmail(List<String> list)  {
	        return (Pattern.matches(sampleEmailPattern,(CharSequence) list));
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Welcome to user registration validation! ");
	    }
}
