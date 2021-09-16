package chapter6quiz.quiz6_7;

public class CardTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();

		Card card1 = company.createCard();
		Card card2 = company.createCard();
		
		System.out.println(card1.getCardId());
		System.out.println(card2.getCardId());
		
	}

}
