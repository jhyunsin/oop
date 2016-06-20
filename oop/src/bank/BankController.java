/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.`1
 * @author : hb2009
 * @file : accountController.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		int ok = 0;
		while (true) {

			switch (JOptionPane.showInputDialog("1개설2입금,3조회,4출금,5통장내역,0종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");

				String[] specArr = new String[3];
				specArr = spec.split(",");
				
				service.openAccount(specArr[0], specArr[1], specArr[2]);
				break;

			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				// account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;

			case "3":
				// JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				// account.withdraw(Integer.parseInt(JOptionPane.showInputDialog("출금액")));
				String outputMoney = JOptionPane.showInputDialog("출금액");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());

				break;

			default:
				ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if (ok == 0) {
					return;
				} else {
					continue;
				}

			}

		}

	}
}
