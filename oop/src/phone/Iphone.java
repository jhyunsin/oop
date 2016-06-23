package phone;

public class Iphone extends CelPhone{
private String data;
public final static String KIND="스마트폰";//OverRiding
public final static String BRAND="아이폰";

public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	 return KIND + "이기 때문에" + super.getMove() + "," ///컨트롤 누르면 최초의 조상으로 찾아간다
			+ super.getCompany() + "제품을 가지고, " 
			+  super.getCall() + "(이)라고 통화하고..."
			+ this.getData()+"를 문자로 보냈다";


}






}
