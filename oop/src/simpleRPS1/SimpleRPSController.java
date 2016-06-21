package simpleRPS1;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	
	public static void main(String[] args) {
	SimpleRPSService service = new SimplePRSSvericeImpl(); /// 핵중요
		JOptionPane.showMessageDialog(null, "가위바위보게임");
		int comp = 0, player = 0;
		Random r = new Random();
		String result = "";
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "go(1)?")) {
			case 0:
				String p = JOptionPane.showInputDialog("1가위2바위3보");
				result = service.gameEngine(r, result, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				return;
			}
		}
	}
}
