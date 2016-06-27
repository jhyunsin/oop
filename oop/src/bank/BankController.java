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
		BankService bankService = new BankServiceImpl();
		int ok = 0;
		String spec = "";
		String[] specArr = new String[3];
		while (true) {

			switch (JOptionPane.showInputDialog("" + "=========개인인터넷뱅킹=======" + "1개설" + "2입금," + "3조회," + "4출금,"
					+ "5통장내역," + "==========은행창구=============" + "11개설" + "12전체조회" + "13계좌번호조회" + "14이름조회" + "15통장 수 조회"
					+ "16통장내역" + "17비번 수정" + "18통장해지" + "0종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");

				specArr = new String[3];
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

			case "11":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				specArr = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setName(specArr[0]);/// 하나의 종이에 적어서 창구에 주더라
				acc.setId(specArr[1]);
				acc.setPw(specArr[2]);
				bankService.openAccount(acc);

				break;
			case "12":
				JOptionPane.showMessageDialog(null, bankService.accountList());
				break;
			case "13": /// Bean에 있는지 없는지 모르니까 String으로 받는다 값을 받아야 한다 input
				String searchAcc = JOptionPane.showInputDialog("검색하려는 계좌번호");// 서비스에다
																				// 던져준다
				bankService.findByAccountNo(searchAcc);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchAcc));
				///받아서 던져만 주는 알바 so casting은 controller에서 하지 않는다
				
				break;
			
			case "14":
				bankService.findByAccountNo(JOptionPane.showInputDialog("검색하려는 이름"));
				break;
			case "15":
				// int count = bankService.count();
				JOptionPane.showMessageDialog(null, "계좌수는" + bankService.count() + "개입니다");

				break;
			case "16":
				break;
			case "17":
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
