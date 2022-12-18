import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Deck {
 static Random r = new Random();
	public static List<Integer> oldDeck = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14));
	static List<String> oldSuit = new ArrayList<String>(Arrays.asList("Spade","Spade","Spade","Spade","Heart","Heart","Diamond","Heart","Club","Club","Club","Club","Diamond"));
	 
	
	
	static List<String> sort(List<Integer> oldDeck, List<Integer> newDeck, List<String> oldSuit) {
		   List<String> newSuit = new ArrayList<String>();
		   List<String> olderSuit = new ArrayList<String>(oldSuit);
		   for (int i = 0; i < oldDeck.size(); i++) {
			for (int j = 0; j < oldDeck.size(); j++) {
				if (oldDeck.get(i) == newDeck.get(j)) {
					newSuit.add(oldSuit.get(j)); 
				}
			}
		}
	   return newSuit;
	   }
	
	public static Set<Integer> shuffle(List<Integer> oldDeck) {//Start of random, non-repeating set method
		Set<Integer> newDeck = new LinkedHashSet<Integer>();
		while (newDeck.size() < 13) {
			newDeck.add(r.nextInt(13) + 2);
		}
		return newDeck;
	}
	
	static Set<Integer> newDeckSet = shuffle(oldDeck);
	
	public static List<Integer> setList(Set<Integer> set) {   //Start of switch back to Array list as needed
		List<Integer> newDeck = new ArrayList<Integer>();
		newDeck.addAll(set);
		return newDeck;
	}
	static List<Integer> newDeck = setList(newDeckSet); //first list
	static Set<Integer> newDeckSet2 = shuffle(newDeck);  
	static List<Integer> newDeck2 = setList(newDeckSet2); //second list
	static Set<Integer> newDeckSet3 = shuffle(newDeck2);  
	static List<Integer> newDeck3 = setList(newDeckSet3); //third list
	static Set<Integer> newDeckSet4 = shuffle(newDeck3);
	static List<Integer> newDeck4 = setList(newDeckSet4); //fourth list
	
	static List<String> stringSort = sort(oldDeck, newDeck, oldSuit);
	static List<String> stringSort2 = sort(newDeck,newDeck2,stringSort);
	static List<String> stringSort3 = sort(newDeck2, newDeck3, stringSort2);
	static List<String> stringSort4 = sort(newDeck3, newDeck4, stringSort3);
	
	public static List<Integer> Deck1Values = new ArrayList<Integer>();
	
	public static List<Integer> splitDeck1(List<Integer> mainDeck) {
		List<Integer> Deck1 = new ArrayList<Integer>();
		for (int i = 0; i < 26; i++) {
			Deck1.add(mainDeck.get(i));
		}
		return Deck1;
	}
	public static List<Integer> splitDeck2(List<Integer> mainDeck) {
		List<Integer> Deck2 = new ArrayList<Integer>();
		for (int i = 26; i < 52; i++) {
			Deck2.add(mainDeck.get(i));
		}
		return Deck2;
	}
	public static List<String> splitSuit1(List<String> mainDeck) {
		List<String> Deck1 = new ArrayList<String>();
		for (int i = 0; i < 26; i++) {
			Deck1.add(mainDeck.get(i));
		}
		return Deck1;
	}
	public static List<String> splitSuit2(List<String> mainDeck) {
		List<String> Deck2 = new ArrayList<String>();
		for (int i = 26; i < 52; i++) {
			Deck2.add(mainDeck.get(i));
		}
		return Deck2;
	}
	
	
	
	public static List<Integer> combineTotalValue(List<Integer> a,List<Integer> b,List<Integer> c,List<Integer> d) {
		List<Integer> totalList = new ArrayList<Integer>();
		totalList.addAll(a);
		totalList.addAll(b);
		totalList.addAll(c);
		totalList.addAll(d);
		return totalList;
	}
	public static List<Integer> totalListValue = combineTotalValue(newDeck,newDeck2,newDeck3,newDeck4);
	
	public static List<String> combineTotalSuits(List<String> a,List<String> b, List<String> c, List<String> d) {
		List<String> totalListValue = new ArrayList<String>();
		totalListValue.addAll(a);
		totalListValue.addAll(b);
		totalListValue.addAll(c);
		totalListValue.addAll(d);
		return totalListValue;
	}
	public static List<String> totalListSuit = combineTotalSuits(stringSort,stringSort2,stringSort3,stringSort4);
	
	public static List<Integer> valueDeck1 = splitDeck1(totalListValue);
	public static List<Integer> valueDeck2 = splitDeck2(totalListValue);
	public static List<String> suitDeck1 = splitSuit1(totalListSuit);
	public static List<String> suitDeck2 = splitSuit2(totalListSuit);
	//NOW split the deck- deck 1 is 0-25
	//deck 2 is 26-52
	
	
	
	
	public static void main(String[] args) {
		System.out.println(valueDeck1.size());
		
	}

}

