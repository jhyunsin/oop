/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : hb2009
 * @file   : Kaup.java
 * @story  : 
  */
public class Kaup {
public String kaup(double outki, double outmom, String outname){

	
			double kaup = 0, ki = 0, mom = 0;
			String name = "", result = "";
			// ---------op--------------
		
			name = outname;
			
			ki = outki;
		
			mom = outmom;
			kaup = ki / mom / mom;

					
					if (kaup < 18.5) {
				result = "저체중";
			} else if (18.5 < kaup && kaup < 22.9) {
				result = "정상체중";
			} else if (23.0 < kaup && kaup < 24.9) {
				result = "위험체중";
			} else if (25.0 < kaup && kaup < 29.9) {
				result = "비만1단계";
			} else if (40 >kaup && kaup > 30) {
				result = "비만2단계";
			} else if (kaup > 40) {
				result = "비만3단계";
			}

			// ----------out --------------
			return name + "은" + result+"이며 비만도는"+kaup+"입니다";


}}
