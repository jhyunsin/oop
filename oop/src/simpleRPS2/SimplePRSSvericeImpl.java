package simpleRPS2;

import java.util.Random;

public class SimplePRSSvericeImpl implements SimpleRPSService {

	@Override
	public String playGame(String p) {
		Random r = new Random();
		String result = "";
		switch (p) {
		// 변수는 무한루프 걸리면 안되니까 밖에 놓는다
		case "1":

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

	@Override
	public String getResult(String result) {

		return "플레이어는 : "+result;
	}

}
