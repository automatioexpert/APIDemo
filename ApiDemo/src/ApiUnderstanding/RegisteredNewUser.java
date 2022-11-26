package ApiUnderstanding;

public class RegisteredNewUser {

	public void registerUser(String username) {
		if (!RegisteredUserName.checkIfUserNameIsTaken(username)) {
			System.out.println("Username is not used earlier");
		} else {
			System.out.println("Username is already taken");
		}
	}

}
