package gameRps;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
		RPSService service = new RPSServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("1계속0종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1가위 2바위 3보자기");
				if(service.checkValidation(rps)){
					service.betPlayerValue(Integer.parseInt(rps));
					service.setComputerValue();
					service.whoWin();
					JOptionPane.showMessageDialog(null, service.showResult());
				}else{
					JOptionPane.showMessageDialog(null, "1~3만 가능");
					continue;
				}
				
				break;

			default:
				break;
			}
			
		}
	}
}