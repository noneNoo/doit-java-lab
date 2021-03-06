package chapter9.quiz;
import java.util.ArrayList;
import java.util.Random;

public class WingTest {

	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList<Idol> idolList = new ArrayList<Idol>();
		IdolType vocal = new VocalIdol();
		IdolType dance = new DanceIdol();
		IdolType visual = new VisualIdol();

		idolList.add(new Idol("ġ????", vocal));
		idolList.add(new Idol("??????", dance));
		idolList.add(new Idol("?긮", visual));
		
		for(Idol idol : idolList) {
			int randomCount = rand.nextInt(5) + 1;
			idol.produce(randomCount);
			System.out.println("==========");
		}
	}

}
