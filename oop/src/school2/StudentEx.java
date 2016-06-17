/**
 * 
 */
package school2;

/**
 * @date : 2016. 6. 16.
 * @author : hb2009
 * @file : Student.java
 * @story :
 */
public class StudentEx {
	private String id, name, ssn, pw, regDate, gender;
	private int age;

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
public void setSsn(String ssn){
	this.ssn = ssn;
}
	
public void setRegDate(String regDate){
	this.regDate = regDate;
}
public void setGender (String gender){
	this.gender = gender;
}
public void setName(String name){
	this.name = name;
}

public String getId(){
	return this.id;
}

public String getPw(){
	return this.pw;
}

public String getSsn(){
	return this.ssn;
}

}
