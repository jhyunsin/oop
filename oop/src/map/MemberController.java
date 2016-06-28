package map;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 28.
 * @author : 신재현
 * @file : MemberController.java
 * @story :
 */

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		
		String temp = "";
		while (true) {
			switch (JOptionPane.showInputDialog("" + "------회원이보는화면------" + "1회원가입2로그인3내정보수정(비번)4탈퇴 0종료\n"
					+ "------관리자가보는화면------" + "11회원목록12검색(ID)13검색(이름)14 검색(성별)15회원수")) {
			case "1":
				 temp = JOptionPane.showInputDialog("id,pw,name,gender");
				String[] arr = temp.split(",");
				MemberBean member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setGender(arr[3]);
				
				JOptionPane.showMessageDialog(null, arr[2] + service.join(member));

				break;
			case "2":
				temp = JOptionPane.showInputDialog("아이디 ,비번 입력");
				String[] arr2 = temp.split(",");
				MemberBean member2 = new MemberBean();
				member2.setId(arr2[0]);
				member2.setPw(arr2[1]);
				JOptionPane.showMessageDialog(null, service.login(member2));

				break;
			case "3":
				service.detail();
				break;
			case "4":
				//service.updatePw(member);

				break;
			case "5":
				service.delete();
				break;

			case "11":
				service.list();
				break;
			case "12":
				service.findById(temp);
				break;
			case "13":
				service.findByName(temp);
				break;
			case "14":
				service.findByGender(temp);
				break;
			case "15":
				service.count();
				break;
			case "0":
				return;

			default:
				break;
			}
		}
	}
}
