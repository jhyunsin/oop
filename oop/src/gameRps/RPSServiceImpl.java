package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService{
RPSBean rps;
	@Override
	public void betPlayerValue(int playerValue) {
		
		
	}

	@Override
	public void setComputerValue() {
		Random random = new Random();
	String comp = String.valueOf(random.nextInt(3)+1);
	}

	@Override
	public void whoWin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String showResult() {
		return null;
		
	}

	@Override
	public boolean checkValidation(String rps) {
		// TODO Auto-generated method stub
		return false;
	}

}
