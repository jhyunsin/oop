/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : hb2009
 * @file   : MonthEnd.java
 * @story  : 
  */
public class MonthEnd {
public String monthend(int outwol){
	
	int wol = 0,end = 0;

	wol = outwol;

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
		
	}

	return wol + "월의 마지막날은" + end + "일입니다";
}}
