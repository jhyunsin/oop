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
/**
데이터베이스에 컬럼값은
aaa(text)
bbb(text)
ccc(number)
ddd(number)
이며
이중 기본값은 bbb,ccc입니다.
그리고 그중에서 ccc 는 보안에
민감한 값이고
bbb 는 수정가능한 값입니다.
메뉴는 1번 등록 2번 조회 0번 종료
* */
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
