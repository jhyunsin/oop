/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : hb2009
 * @file : Kaup2.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup0 {
	String name, height, weight;

	public void setName(String name) { // write
		this.name = name;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public String getHeight() {
		return this.height;
	}

	public String getWeight() {
		return this.weight;
	}

	public void saveDB(String n, String h, String w) {
		String name = n, result = "";
		double kaup = 0.0, height = Double.parseDouble(h), weight = Double.parseDouble(w);
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

	}

	public String execute() {
		// ----------init---------
		String result = "";
		double kaup = 0.0, height =Double.parseDouble(this.height), weight = Double.parseDouble(this.weight);
		// --------op
		

		kaup = weight / (height / 100) / (height / 100);

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

		double d = Double.parseDouble(String.format("%.2f", kaup));
		/* d 자리에 짤라서 넣는것이 좋다*/


		return name + "의 BMI지수는 " + d + "이고, " + result + "이다";
		
	}
}
