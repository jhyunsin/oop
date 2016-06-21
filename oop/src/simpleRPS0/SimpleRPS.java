package simpleRPS0;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPS {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "가위바위보게임");
		int comp = 0, player = 0;
		Random r = new Random();
		String result = "";
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "go(1)?")) {
			case 0:
				String p = JOptionPane.showInputDialog("1가위2바위3보");
				result = gameEngine(r, result, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * @param r
	 * @param result
	 * @param p
	 * @return
	 */
	private static String gameEngine(Random r, String result, String p) {
//		int player; 
		switch (p) {
		// 변수는 무한루프 걸리면 안되니까 밖에 놓는다
		case "1":
//			player = 1;
			// comp = (int) (Math.random()*3)+1;

			switch (r.nextInt(3) + 1) {
			case 1:
				result = "tie";
				break;
			case 2:
				result = "lose";
				break;
			case 3:
				result = "win";
				break;

			default:
				break;
			}

		case "2":
			switch (r.nextInt(3) + 1) {
			case 1:
				result = "win";
				break;
			case 2:
				result = "tie";
				break;
			case 3:
				result = "lose";
				break;
			default:
				break;
			}

		case "3":
			switch (r.nextInt(3) + 1) {
			case 1:
				result = "lose";
				break;
			case 2:
				result = "win";
				break;
			case 3:
				result = "tie";
				break;
			default:
				break;
			}

		default:
			break;
		}
		return result;
	}

}