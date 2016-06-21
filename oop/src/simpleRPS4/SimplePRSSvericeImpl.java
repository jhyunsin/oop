package simpleRPS4;///3에서 수식만 바꾼것

import java.util.Random;

public class SimplePRSSvericeImpl implements SimpleRPSService {
	SimpleRPSBean rps = new SimpleRPSBean();

	@Override
	public String playGame(int player) {//show me the money 
		Random r = new Random();
		String result = "", winner="";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp(); /// 변수를 여러번 써서 그냥 한번 담았다
		int ply = rps.getPlay();
		
		if(com==ply){
			return "TIE";
		}
			switch (Math.abs(ply-com)) {
			case 1:
				result = (ply>com)? "win" : "lose";
				break;
			case 2:
				result = (ply>com)? "lose" : "win";
				break;

			default:
				break;
			}
			
		
	winner = (com ==ply)?"플레이어":"컴퓨터";	
	result = winner + "승리";
	return result;

	}

	@Override
	public String getResult(String result) {

		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
				+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
				+"결과"+this.playGame(rps.getPlay());
	}

}
