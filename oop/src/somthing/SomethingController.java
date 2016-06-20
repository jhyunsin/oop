/**
 * 
 */
package somthing;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.WhileNode;
import school.StudentBean;

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
String sddd = JOptionPane.showInputDialog("ddd");
			s.setAaa(aaa);///???
			int ddd = Integer.parseInt(sddd);
			s.setDdd(ddd);///???
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "aaa값은"+s.getAaa()+"bbb값은"+s.getBbb()+"ccc값은"+s.getCcc()+"ddd값은"+s.getDdd());
			
			
			break;
		case "0":
			
			JOptionPane.showConfirmDialog(null, "종료?");
			if (ok==0) {
				
			} else {

			}
			return;

		}
	}
	

}
	
	
	
	
	
}
