import java.util.ArrayList;

public class DotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		DotCom dotCom = new DotCom();
		int randomNum = (int) (Math.random() * 5);

		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		dotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = dotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
