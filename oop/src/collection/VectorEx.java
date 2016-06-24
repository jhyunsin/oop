package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import school.StudentBean;

public class VectorEx {
	public static void main(String[] args) {

		List<StudentBean> v = new Vector<StudentBean>();
		StudentBean searchTest = null;//객체자체가 null인상태
		StudentBean searchMan = new StudentBean();//객체의 속성(prop)가 null인상태
		System.out.println(":::::Vector생성시:::::");
		System.out.println("size:" + v.size());
		// 자원추가
		StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");//
		StudentBean kim = new StudentBean("kim", "1", "김유신", "800101-1");
		StudentBean lee = new StudentBean("lee", "1", "이순신", "010101-3");
		v.add(hong);
		v.add(kim);
		v.add(lee);

		System.out.println(searchTest.getName());//null이라서 겟네임을 갖다 쓸수 없다
		System.out.println(searchMan.getName());//
		System.out.println(hong.getName());
		
		
		System.out.println("::::::요소추가후::::::");
		System.out.println("size:" + v.size());
		// System.out.println(v.toString());
		String searchName = "이순신";

		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchName)) {
				searchMan = v.get(i);

			}

			// System.out.println(v.get(i).getName());// v.get(i) 는 객체가 호출되는것

		}
		if (searchMan.getName() == null) { // Or !searchName.equles(searchMan.getName()))
			         // 스트링은 == 을 쓸수가 있다
			System.out.println(searchName + "라는 이름은 없습니다");
		} else {
			System.out.println(searchMan.toString());
		}

		// String[]str = new String[3];
		// for (int i = 0; i < str.length; i++) {
		// System.out.println(str[i]); // 꼴랑 인스턴스 변수 하나
		// }
		
		if (v.contains(searchName)) {//searchName 이 있는지를 찾는 소스
			int index = v.indexOf(searchName);// 존재 여부를 확인할때는 searchName.getName() 하지 않고 그냥 searchName이다
			v.remove(index);
			
			//System.out.println("존재함");
		}else{
			System.out.println("존재x");
		}
		System.out.println(v);// 컬렉션은 투스트링 하지 않는다 알아서 다 나온다
	}
}