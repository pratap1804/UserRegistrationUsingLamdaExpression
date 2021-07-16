import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmailValidationTest {
	
	String emailAddress;
    boolean expected;

   public EmailValidationTest(String emailAddress, boolean expected) {
       this.emailAddress = emailAddress;
       this.expected = expected;
   }
   
   
   public static List<String> emailListMethod() {
	   
	   List<String> emailList = new ArrayList<String>();
	   	emailList.add("abc.100@yahoo.com");
	   	emailList.add("abc111@abc.com");
	   	emailList.add("abc.100@gmail.com.au");
	   	return emailList;
}

   @Test
   public void givenEmailId_WhenValid_ShouldReturnTrue_OtherwiseFalse() {
       UserRegistration userRegistration = new UserRegistration();
       Assert.assertTrue(userRegistration.validateSampleEmail(emailListMethod()));
   }
}
