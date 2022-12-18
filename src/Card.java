import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
	
	public static int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	public int cardValue;
	public String suit;
	String Diamonds = "Diamond";
	String Hearts = "Heart";
	String Spades = "Spade";
	String Clubs = "Club";
	
	static int getCardValue(int x) {
		return value[x];
	}
	
	static String getSuit(String suit) {
		return suit;
	}
	public void setValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public static void main(String[] args) {
		
		List<Integer> listing = new ArrayList<Integer>(Arrays.asList(2,5,3,5,9,3));
		listing.subList(0, 3).clear();
		System.out.println(listing);
	}

}
