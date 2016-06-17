/**
 * 
 */
package school;

import javax.swing.JOptionPane;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

/**
 * @date : 2016. 6. 16.
 * @author : hb2009
 * @file : SchoolController.java
 * @story :
 */
public class SchoolController {
	public static void main(String[] args) {
		Student s = null;
		// String id = null;
		int confirm = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":

				String id = JOptionPane.showInputDialog("ID");
				String pw = JOptionPane.showInputDialog("PW");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");

				s = new Student(id, pw, name, ssn);

				break;

			case "2":
				JOptionPane.showMessageDialog(null, "Id:" + s.getId() + "이름" + s.getName() + ""
						+ "주민번호" + s.getSsn()+"성별2"+s.getGender()+"나이"+s.getAge());

				break;// case2에서 이름 id 성별을 출력

			case "0":
				confirm = JOptionPane.showConfirmDialog(null, "종료??");
				if (confirm == 0) {
					
				} else {
					continue; 
				}
				return;
			
			
			default:
				break;
			}

		}

	}
}
