/**
 * 
 */
package somthing;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.WhileNode;
import school.Student;

/**
 * @date   : 2016. 6. 17.
 * @author : hb2009
 * @file   : SomethingController.java
 * @story  : 
  */
public class SomethingController {

public static void main(String[] args) {
	Something s = null;
	

	int ok = 0;
	while (true) {
		switch (JOptionPane.showInputDialog("1등록,2조회,0종료")) {
		case "1":
			String bbb = JOptionPane.showInputDialog("bbb 문자");
			String sccc = JOptionPane.showInputDialog("ccc 숫자");
			int ccc = Integer.parseInt(sccc);
			s=new Something(bbb, ccc);
			
			String aaa = JOptionPane.showInputDialog("aaa");
			int ccc = Integer.parseInt(JOptionPane.showInputDialog("ccc"));
			s.setAaa(aaa);
			String sddd = Integer.parseInt(JOptionPane.showInputDialog("ddd"));
			s.setDdd(ddd);
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "aaa값은"+s.getAaa()+"bbb값은"+s.getBbb()+"ccc값은"+s.getCcc()+"ddd값은"+s.getDdd());
			
			
			break;
		case "0":
			
			JOptionPane.showConfirmDialog(null, "종료?");
			
			return;

		default:
			break;
		}
	}
	

}
	
	
	
	
	
}
