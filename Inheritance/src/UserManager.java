
public class UserManager {
	public void login(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sisteme giri� yapt�.");
	}
	public void logout(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sistemden ��k�� yapt�.");
	}
	public void signUp(User user) {
		System.out.println("ID :"+user.getId()+" "+user.getFirstName()+" "+user.getLastName()+" sisteme kay�t yapt�.");
	}
	

}
