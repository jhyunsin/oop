package phone;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone = new Phone();//인스턴스
		CelPhone celphone = new CelPhone();
		Iphone iphone = new Iphone();
		AndroidPhone androidphone = new AndroidPhone();
		while (true) {
			String f = JOptionPane.showInputDialog("1유선폰2휴대폰3아이폰4갤러시노트종료");
			switch (f) {
			case "1":// 변수 만들어주고 쓰고,,, 쓰고 읽고 쓰고 읽고
				String company = "", call = "";
				company = JOptionPane.showInputDialog("어느회사제품?");
				phone.setCompany(company);
				call = JOptionPane.showInputDialog("통화내용");
				phone.setCall(call);
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2":
				celphone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				celphone.setCall(JOptionPane.showInputDialog("통화내용"));
				celphone.setPortable(true);
				JOptionPane.showMessageDialog(null, celphone.toString());
				break;
			case "3":
				iphone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				iphone.setCall(JOptionPane.showInputDialog("통화내용"));
				iphone.setData(JOptionPane.showInputDialog("문자내용"));				
				iphone.setPortable(true);
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
						case "4":
				androidphone.setData(JOptionPane.showInputDialog("통화내용"), 
						JOptionPane.showInputDialog("사이즈"), 
						JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null, androidphone.toString());
								break;
			
			case "0":
				return;
			default:
				break;
			}
		}

	}
}
