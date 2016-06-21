package simpleRPS3;

import java.util.Random;

public class SimplePRSSvericeImpl implements SimpleRPSService {
	SimpleRPSBean rps = new SimpleRPSBean();

	@Override
	public String playGame(int player) {
		Random r = new Random();
		String result = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp(); /// 변수를 여러번 써서 그냥 한번 담았다
		switch (player) {// 변수는 무한루프 걸리면 안되니까 밖에 놓는다
		
		case 1:
			// comp = (int) (Math.random()*3)+1;
			switch (com) {
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

		case 2:
			switch (com) {
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

		case 3:
			switch (com) {
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

		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
				+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
				+this.playGame(rps.getPlay());
	}

}
