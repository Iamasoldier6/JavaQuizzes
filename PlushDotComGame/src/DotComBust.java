import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		// 创建 3 个 DotCom 对象，指派名称并置入 ArrayList
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, sToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3); // DotCom 的位置
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		while (!dotComsList.isEmpty()) { // 判断 DotCom 的 list 是否为空
			String userGuess = helper.getUserInput("Enter a guess"); // 取得玩家的输入
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++; // 递增玩家猜测次数的计数
		String result = "miss"; // 先假设没有命中
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess); // 要求 DotCom
															// 检查是否命中或击沉
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}

	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
