/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 14.
 * @author : hb2009
 * @file : Controller.java
 * @story :
 */
public class Controllerbak {
	public static void main(String[] args) {
		String menu = "";

		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		Kaup kaupEx = new Kaup();
		MonthEnd monthEndEx = new MonthEnd();
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기 "
					+ "2.카우프 "
					+ "3.년월말 "
					+ "0종료");
//1.계산기 2.카우푸 3.년 월말 4.1등 구하기 5.학번/나이 
//6.최고죄저점수 7.세금액 8.성별판별 9.시분초구하기 0.종료
			

			switch (menu) {
			
			case "0": JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");

			return;

			case "1": 
				System.out.println("a + b 입력");
				System.out.println(calc.calc(s.nextInt(), s.next(), s.nextInt()));
				break;
				

				

			case "2": 
				System.out.println("이름 키 몸무게 입력");
				System.out.println(kaupEx.kaup(s.nextDouble(), s.nextDouble(), s.next()));
				break;
				
			case "3":
				
			System.out.println("년 월 입력");
			System.out.println(monthEndEx.monthend(s.nextInt()));
			 break;
			case "4":
				
				break;
			case "5":
			
			
				break;
			
			case "6":
				
				
				break;
			case "7":
				
				
				break;
		
			
			
			default:
				 System.out.println("메뉴에 없는 번호입니다");
				System.out.println("0~3에서 선택하세요");
				break;

			}
			System.out.println();
/////////// 끝 //////////////////////
		}

	}

	/**
	 * @param scanner
	 */
	private static void monthEnd(Scanner scanner) {
		int wol = 0, end = 0;

		System.out.println("몇월?");
		wol = scanner.nextInt();

		switch (wol) {
		case 1:
			end = 31;
			break;
		case 2:
			end = 29;
			break;
		case 3:
			end = 31;
			break;
		case 4:
			end = 30;
			break;
		case 5:
			end = 31;
			break;
		case 6:
			end = 30;
			break;
		case 7:
			end = 31;
			break;
		case 8:
			end = 31;
			break;
		case 9:
			end = 30;
			break;
		case 10:
			end = 31;
			break;
		case 11:
			end = 30;
			break;
		case 12:
			end = 31;
			break;

		default:
			System.out.println("1~12월까지만");
			return;
		}

		System.out.println(wol + "월의 마지막날은" + end + "일입니다");
	}

	/**
	 * @param scanner
	 */
	private static void kaup(Scanner scanner) {
		// --------init------

		double kaup = 0, ki = 0, mom = 0;
		String name = "", result = "";
		// ---------op--------------
		System.out.println("이름");
		name = scanner.next();
		System.out.println("키");
		ki = scanner.nextInt();
		System.out.println("몸무게");
		mom = scanner.nextInt();
		kaup = ki / mom / mom;

		if (kaup < 18.5) {
			result = "저체중";
		} else if (18.5 < kaup && kaup < 22.9) {
			result = "정상체중";
		} else if (23.0 < kaup && kaup < 24.9) {
			result = "위험체중";
		} else if (25.0 < kaup && kaup < 29.9) {
			result = "비만1단계";
		} else if (40 > kaup && kaup > 30) {
			result = "비만2단계";
		} else if (kaup > 40) {
			result = "비만3단계";
		}

		// ----------out --------------
		System.out.println(name + "은" + result + "이며 비만도는" + kaup + "입니다");
	}

	
}
