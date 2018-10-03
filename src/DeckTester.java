/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// deck 1
		System.out.println("------deck one test-------");
		String[] ranks1 = {"Ace","two","three","Queen", "King"};
		String[] suits1 = {"Hearts","Diamonds","Spades","Clubs"};
		int [] points1 = {1,2,3,5,8};
		Deck one = new Deck(ranks1, suits1, points1);
		System.out.println("Deck1 isEmpty: " + one.isEmpty());
		System.out.println("Deck1 toString: ");
		System.out.println(one);
		// deck 2
		System.out.println("------deck two test-------");
		String[] suits2 = {"Hearts","Diamonds","Spades","Clubs"};
	    int[] points2= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    String[] ranks2 = {"Ace","two","three","four","five","six","seven","eight","nine","ten","Jack","Queen","King"};
	    Deck two = new Deck(ranks2, suits2, points2);
	    System.out.println("Deck2 isEmpty: " + two.isEmpty());
		System.out.println("Deck2 toString: ");
		System.out.println(two);
		//deck 3
		System.out.println("------deck three test-------");
		Deck three = new Deck(ranks2, suits2, points2);
	    System.out.println("Deck3 isEmpty: " + three.isEmpty());
	    System.out.println("____dealing cards_____");
	    while(!three.isEmpty()) {
	    	System.out.println(three.deal());
	    }
	    System.out.println("Deck3 isEmpty: " + three.isEmpty());
	}
}