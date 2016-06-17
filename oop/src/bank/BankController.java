/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : hb2009
 * @file : accountController.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		String s = null;// =""
		String s1 = new String("hi");
		Account account = null; // 레퍼런스변수선언
		int ok = 0;
		while (true) {

			switch (JOptionPane.showInputDialog("1개설2입금,3조회,4출금,5통장내역,0종료")) {

			case "1":
				ok = JOptionPane.showConfirmDialog(null, "계좌개설 yes?");
				if (ok == 0) {
					// account.setAccountNo(); //세터가 없으니까 지운다
					String name = JOptionPane.showInputDialog("이름");

					account = new Account(name);

				} else {
					continue;
				}
				// 컨펌 없을때
				// account.setAccountNo(Integer.parseInt(inputAccountNo));
				break;

			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				account.setMoney(Integer.parseInt(inputMoney));

				break;

			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());

			case "5":
				JOptionPane.showMessageDialog(null,
						Account.BANK_NAME + "이름 : " + account.getName() 
						
						
						
						
						
						+ "계좌번호 : " + account.getAccountNo());// 프로모션
																												// 되었음

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
