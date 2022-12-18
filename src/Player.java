import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends Deck {
	static List<Integer> PlayerHand = new ArrayList<Integer>();
	static List<String> PlayerHandSuit = new ArrayList<String>();
	static List<Integer> ComputerHand = new ArrayList<Integer>();
	static List<String> ComputerHandSuit = new ArrayList<String>();
	
	public static void compareHandValue(List<Integer> Deck1, List<Integer> Deck2, List<String> Suit1, List<String> Suit2, int i) {
		
		if (Deck1.get(i) > Deck2.get(i)) {
			Deck1.add(Deck1.size(), Deck2.get(i)); //Adding the Deck2 value to the back of the player 1 deck
			Deck1.add(Deck1.size(), Deck1.get(i));
			Deck2.remove(i);
			Deck1.remove(i);
			
			//now I must think about suits
			Suit1.add(Suit1.size(), Suit2.get(i));
			Suit1.add(Suit1.size(), Suit1.get(i));
			Suit2.remove(i);
			Suit1.remove(i);
			
			
		} else if (Deck2.get(i) > Deck1.get(i)) {
			Deck2.add(Deck2.size(), Deck1.get(i));
			Deck2.add(Deck2.size(), Deck2.get(i));
			Deck1.remove(i);
			Deck2.remove(i);
			
			Suit2.add(Suit2.size(), Suit1.get(i));
			Suit2.add(Suit2.size(), Suit2.get(i));
			Suit1.remove(i);
			Suit2.remove(i);
			
		
		} else if (Deck1.get(i) == Deck2.get(i)) {
			System.out.println("WAR!");
			System.out.println("Player1 got a " + Deck1.get(i + 4) + " of " + Suit1.get(i + 4));
			System.out.println("Player2 got a " + Deck2.get(i + 4) + " of " + Suit2.get(i + 4));
			if (Deck1.get(i + 4) > Deck2.get(i + 4)) {
				for (int a = 0; a < 4; a++) {
					Deck1.add(Deck1.size(), Deck2.get(a));
					Suit1.add(Suit1.size(), Suit2.get(a));
					Deck1.add(Deck1.size(), Deck1.get(a));
					Suit1.add(Suit1.size(), Suit1.get(a));
				}
				Deck1.subList(0, 4).clear();
				Deck2.subList(0, 4).clear();
				Suit1.subList(0, 4).clear();
				Suit2.subList(0, 4).clear();
			}
			else if (Deck2.get(i + 4) > Deck1.get(i + 4)) {
				for (int a = 0; a < 4; a++) {
					Deck2.add(Deck2.size(), Deck1.get(a));
					Suit2.add(Suit2.size(), Suit1.get(a));
					Deck2.add(Deck2.size(), Deck2.get(a));
					Suit2.add(Suit2.size(), Suit2.get(a));
				}
				Deck1.subList(0, 4).clear();
				Deck2.subList(0, 4).clear();
				Suit1.subList(0, 4).clear();
				Suit2.subList(0, 4).clear();
			} else if (Deck1.get(i + 4) == Deck2.get(i + 4)) {
				for (int a = 0; a < 4; a++) {
					Deck2.add(Deck2.size(), Deck1.get(a));
					Suit2.add(Suit2.size(), Suit1.get(a));
					Deck2.add(Deck2.size(), Deck2.get(a));
					Suit2.add(Suit2.size(), Suit2.get(a));
				}
				Deck1.subList(0, 4).clear();
				Deck2.subList(0, 4).clear();
				Suit1.subList(0, 4).clear();
				Suit2.subList(0, 4).clear();
			}
		}
		
		
	}
	
	
	public static void draw1(List<Integer> deckValue, List<String> suitValue, int i) {
			System.out.println("Player1 got a " + deckValue.get(i) + " of " + suitValue.get(i));
	}
	public static void draw2(List<Integer> deckValue, List<String> suitValue, int i) {
		System.out.println("Player2 got a " + deckValue.get(i) + " of " + suitValue.get(i));
	}
	
public static void main(String[] args) {
	
	System.out.println(valueDeck1);
	System.out.println(valueDeck2);
	while ((valueDeck1.size() >= 0) || (valueDeck2.size() >= 0)) {
		if ((valueDeck1.get(0) == valueDeck2.get(0)) && ((valueDeck1.size() < 5) || (valueDeck2.size() < 5))) {
			System.out.println("CONGRATULATIONS PLAYING!");
			break;
		}
      
		draw1(valueDeck1, suitDeck1, 0);
		draw2(valueDeck2, suitDeck2, 0);
		compareHandValue(valueDeck1, valueDeck2, suitDeck1, suitDeck2, 0);
		
		System.out.println(valueDeck1);
		System.out.println(valueDeck2);
		
		if (valueDeck1.size() == 0) {
			System.out.println("CONGRATULATIONS PLAYER 2 YOU WIN");
			System.out.println("GAME OVER");
			break;
		} else if (valueDeck2.size() == 0) {
			System.out.println("CONGRATULATIONS PLAYER 1 YOU WIN");
			System.out.println("GAME OVER");
			break;
		}
	}  
		
		
	}
	
	
	
	
	
}
