
public class UserException extends Exception {

    enum ExceptionType {
        invalidFirstName, invalidLastName, invalidEmail, invalidMobileNumber, invalidPassword ;
    }

    ExceptionType type;
	String message;
	
    public UserException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }
}
