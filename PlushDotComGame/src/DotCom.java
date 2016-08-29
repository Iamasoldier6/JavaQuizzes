import java.util.*;

public class DotCom {
	private ArrayList<String> locationCells; // 保存位置
	private String name; // DotCom 的名称

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		// 若玩家猜中，返回它的位置，否则返回 －1
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunk " + name + "  : ( ");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}
