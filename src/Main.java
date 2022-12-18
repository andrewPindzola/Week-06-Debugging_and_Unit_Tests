import java.util.List;
import java.util.Scanner;

public class Main extends Deck {


	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to WAR");
		System.out.println("Would you like to be Player 1 or 2?");
		int type = s.nextInt();
		System.out.println("Okay Player " + type + ", let's play!");
		System.out.println("Shuffling Deck..");
		System.out.println("Ready?");
		s.nextLine();
		System.out.println("WAR!");
		
			

	}

}
