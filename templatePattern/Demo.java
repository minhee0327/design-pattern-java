package templatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import templatePattern.networks.Facebook;
import templatePattern.networks.Network;
import templatePattern.networks.Twitter;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Network network = null;
		System.out.println("Input user Name: ");
		String userName = br.readLine();
		System.out.println("Input Password: ");
		String password = br.readLine();
		
		System.out.println("Input message: ");
		String message = br.readLine();
		
		System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(br.readLine());
		
		if(choice == 1) {
			network = new Facebook(userName, password);
		}else if (choice == 2) {
			network = new Twitter(userName, password);
		}
		
		network.post(message);
	}
}
