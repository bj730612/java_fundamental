
class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) 
	{
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card("HEART", 7);
		Card c2 = new Card("DIAMOND", 11);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1);
		System.out.println(c2);
	}

}
