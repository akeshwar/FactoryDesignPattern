import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which Social networking site would you like to login through?");
		String social_network_name = keyboard.next();
		
		LogIn object = Factory.CreateInstance(social_network_name);	//now the respective object would be created.
		object.login();
		
		keyboard.close();
	}
}
