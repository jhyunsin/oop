/**
 * 
 */
package somthing;

/**
 * @date   : 2016. 6. 17.
 * @author : hb2009
 * @file   : something.java
 * @story  : 
  */
public class Something {
	private String aaa, bbb; //private먼저 선언
	private int ddd, ccc;
	
	public Something(String bbb, int ccc){

	this.bbb = bbb;
	this.ccc = ccc;
	}
	
	
	
	public void setAaa(String aaa){
		this.aaa = aaa;
	}
	public void setBbb(String bbb){
		this.bbb = bbb;
	}
	public void setDdd(int ddd){
		this.ddd = ddd;
	}
	
public String getAaa(){
	return this.aaa;
}
public String getBbb(){
	return this.bbb;
}
public int getCcc(){
	return this.ccc;
}
public int getDdd(){
	return this.ddd;
}


}
