package map;

/**
 * @date   : 2016. 6. 29.
 * @author : 신재현
 * @file   : StringEx.java
 * @story   :
 */

public class StringEx {
public static void main(String[] args) {
	String name1 = "홍길동";
	String name2 =  "홍길동";
if (name1 == name2) {
	System.out.println("name1 == name2 ");/// 상수풀에서 홍길동이라는 일종의 이미지를 name1 name2가 다 가져다가 쓴다
} else {
	System.out.println("name1 != name2 ");
}
String name3 = new String ("홍길동");/// 필요 없는 메모리가 2개 생기니까 하지마라
String name4 = new String ("홍길동");

if (name3 == name4) {
	System.out.println("name3 == name4 ");
} else {
	System.out.println("name3 != name4 ");
}
// .equals()는 이미지 그 자체를 비교한다 so 다 같다 /// 
}
}
