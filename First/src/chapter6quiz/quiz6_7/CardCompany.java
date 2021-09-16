package chapter6quiz.quiz6_7;

public class CardCompany {
	// 고유 번호
	private static int cardNum = 1000;
	public String companyName = "BC";
	
	public int getCardNum() {
		return cardNum;
	}
	
	public Card createCard() {
		Card newCard = new Card();
		return newCard;
	}
	
	// 1. 기본 생성자
	private CardCompany() {
		
	}
	
	private static CardCompany instance = new CardCompany();
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	
	
}
