/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date : 2016. 6. 16.
 * @author : hb2009
 * @file : Student.java
 * @story :
 */

public class Student {
	private String id, name, ssn, pw, regDate, gender; // 남 m 여 w
	private int age;

	// public final static String

	public Student(String id, String pw, String name, String ssn) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		this.gender = null;
	
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		
		String[] arr = new String[2];
				arr = ssn.split("-");

		switch (Integer.parseInt(arr[1])%2) {
		case 1:
			this.gender = "남";
			break;

		default:
			this.gender = "여";
			
			break;
		}


	
	
	
	
	
	}
	
		
		
		
		 
		
	

	// public void setId(String id) { ----> 변경불가 한 항목을 지운다
	// this.id = id;
	// }

	/// public void setPw(String pw) {
	/// this.pw = pw;
	/// }

	/// public void setName(String name) {
	/// this.name = name;

	/// }

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	/// public void setGender(String gender) {
	/// this.gender = gender;
	/// }

	// public void setSsn(String ssn) {
	// this.ssn = ssn;
	// }

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

	public String getName() {
		return this.name;
	}

	public String getRegDate() {
		return this.regDate;
	}

	public String getGender() {
		return this.gender;
	}

	public String getSsn() {
		return this.ssn;
	}

	public int getAge() {
		return this.age;
	}








	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 이름=" + name + ", 주민번호=" + ssn + ", 비밀번호=****" +" 등록일=" + regDate
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}
