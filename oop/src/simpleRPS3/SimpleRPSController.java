package simpleRPS3;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	
	public static void main(String[] args) {
	SimpleRPSService service = new SimplePRSSvericeImpl(); /// 핵중요
		JOptionPane.showMessageDialog(null, "가위바위보게임");
		Random r = new Random();//지울영역
		String result = "", match="";//지울영역
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "go(1)?")) {
			case 0:
				String player = JOptionPane.showInputDialog("1가위2바위3보");//합쳐지는부분
				match = service.playGame(Integer.parseInt(player));//합쳐지는부분 int값으로 바꿈
				result = service.getResult(match);//합쳐지는부분
				JOptionPane.showMessageDialog(null, result);//합쳐지는부분
				break;
			default:
				return;
			}
		}
	}
}
