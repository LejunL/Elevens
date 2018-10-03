/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		// card 1
		System.out.println("----------Card one test-------------");
		Card one = new Card("ace", "spades", 1);
		System.out.println(one.suit());
		System.out.println(one.rank());
		System.out.println(one.pointValue());
	
		// card 2
		System.out.println("----------Card two test-------------");
		Card two = new Card("ace", "spades", 1);
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println("Card one matches Card two: " + one.matches(two));
		//card 3
		System.out.println("----------Card three test-------------");
		Card three = new Card("jack", "hearts", 4);
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println("Card 1 matches Card 2: " + one.matches(three));
	}
}