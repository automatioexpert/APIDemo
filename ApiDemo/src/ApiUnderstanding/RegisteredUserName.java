package ApiUnderstanding;

import java.util.Arrays;
import java.util.List;

public class RegisteredUserName {

	static List<String> registeredUsers=(List<String>) Arrays.asList("Steve Jobs","Bill Gates","VV");
	
	
	public static boolean checkIfUserNameIsTaken(String userName) {
		
		return registeredUsers.contains(userName);
	}
	
}
