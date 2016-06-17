/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : hb2009
 * @file   : ArrAssign.java
 * @story  : 
  */
public class ArrAssign {
public String arrAssign(int outcount,String outname, int outage){

	int i = 0, count = 0;
	
	count = outcount;
	int[] hak = new int[count];
	int[] age = new int[count];
	String[] name = new String[count];
	
	for (i = 0; i < age.length; i++) {
		// ------학번
		
		name[i] = outname;
		age[i] = outage;

	}
	System.out.println("=================\n");
	System.out.println("학번| 이름 | 나이\n");
	System.out.println("=================\n");

	for (i = 0; i < count; i++) {
		System.out.printf("%s %d ", name[i], age[i]);
	}
	return outname; // <-지우기
	
	
}}
