/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.Kaup;

/**
 * @date : 2016. 6. 15.
 * @author : hb2009
 * @file : KaupController.java
 * @story :
 */
public class KaupController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Kaup0 k = new Kaup0();
		while (true) {

			switch (JOptionPane.showInputDialog("1실행,0종료")) {
			case "1":
				String name = JOptionPane.showInputDialog("이름");
				String height = JOptionPane.showInputDialog("키");
				String weight = JOptionPane.showInputDialog("몸무게");
				System.out.println("이름,키,몸무게?");

				k.setName(name);
				k.setHeight(height);
				k.setWeight(weight);
				JOptionPane.showMessageDialog(null, k.execute());
				break;

			default:
				JOptionPane.showConfirmDialog(null, "Close?");
				return;
			}
		}

	}
}
