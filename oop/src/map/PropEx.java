package map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * @date : 2016. 6. 29.
 * @author : 신재현
 * @file : MapEx.java
 * @story :
 */

public class PropEx {
	public static void main(String[] args) {
		Properties prop = new Properties();
		// key value = get(key)
		prop.put("신촌역", "마포구 신촌로 90");/////alias알리야스
		prop.put("이대역", "마포구 신촌로 180");
		prop.put("홍대역", "마포구 양화로 160");
		prop.put("합정역", "마포구 양화로 55");
		
		List<String> list = new ArrayList<String>();
		
		Enumeration keys = prop.propertyNames();

		
		while (keys.hasMoreElements()) {
	list.add((String) keys.nextElement());
}	
	System.out.println(list);
	}
}