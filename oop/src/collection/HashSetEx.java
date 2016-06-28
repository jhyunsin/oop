package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import school.StudentBean;

public class HashSetEx {
	public static void main(String[] args) {
//		String[] str = { "java", "Beans", "java", "SML" };

		Set<StudentBean> stu = new HashSet<StudentBean>();
		StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");
		StudentBean kim = new StudentBean("kim", "1", "김유신", "800101-1");
		StudentBean lee = new StudentBean("lee", "1", "이순신", "010101-3");

		stu.add(hong);   ///set 저장한다  setHong(
		stu.add(kim);
		stu.add(lee);
	
		System.out.println(stu.toString());
	String[] s = new String[3];
	}
}
