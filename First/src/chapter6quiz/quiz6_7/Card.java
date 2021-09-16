package chapter6quiz.quiz6_7;

public class Card {
	private static int cardSerialNum = 1000;
	private int cardID;
	
	public Card() {
		cardID = cardSerialNum;
		cardSerialNum++;
	}
	
	public int getCardId() {
		return cardID;
	}
}
