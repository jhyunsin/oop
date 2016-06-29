package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date : 2016. 6. 29.
 * @author : 신재현
 * @file : MapEx.java
 * @story :
 */

public class MapEx {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();

		Phone note = new Phone();

		note.setFactory("삼성");
		note.setProduct("갤럭시노트");
		note.setPrice(100);

		Phone iPhone = new Phone();

		iPhone.setFactory("애플");
		iPhone.setProduct("iPhone6plus");
		iPhone.setPrice(110);

		Phone g5 = new Phone();
		g5.setFactory("LG");
		g5.setProduct("LG-H830");
		g5.setPrice(90);

		map.put("갤노트", note);
		map.put("아이폰", iPhone);
		map.put("g5", g5);

		List<String> keyList = new ArrayList<String>();
		List<Phone> entryList = new ArrayList<Phone>();

		for (Map.Entry<String, Object> entry : map.entrySet()) {/// key만 던지는게
																/// 아니라 다 던져야 되서
																/// Object를 준다
			System.out.println();
			keyList.add(entry.getKey());
			entryList.add((Phone) entry.getValue());
		}

		System.out.println("키값목록:" + keyList);
		System.out.println("엔트리값목록:" + entryList);

	}
}

class Phone {/// 클라스 두개 가능 하지만 퍼블릭은 하나
	private String factory;
	private String product;
	private int price;

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [factory=" + factory + ", product=" + product + ", price=" + price + "]";
	}

}
