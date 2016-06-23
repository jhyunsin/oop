package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import school.StudentBean;

public class VectorEx {
public static void main(String[] args) {
	
	List<StudentBean> v = new Vector<StudentBean>();
	System.out.println(":::::Vector생성시:::::");
System.out.println("size:"+v.size());	
//자원추가

StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");
StudentBean kim = new StudentBean("kim", "1", "김유신", "800101-1");
StudentBean lee = new StudentBean("lee", "1", "이순신", "010101-3");
v.add(hong);
v.add(kim);
v.add(lee);

System.out.println("::::::요소추가후::::::");
 System.out.println("size:"+v.size());
//System.out.println(v.toString());
for (int i = 0; i < v.size(); i++) {
	System.out.println(v.get(i).getName());
}
}
}
