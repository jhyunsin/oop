package phone;

public class AndroidPhone extends Iphone {
	public final static String BRAND = "갤럭시노트";
	private String size, data;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getData() {// Iphone 의 data / 안드로이드의 data
		return data;
	}

	public void setData(String call, String size, String data) {//뻔한것은 빈객체 안에서 끝내버리자!!
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.data = //슈퍼와 디스를 혼용 내꺼면 디스 남에꺼면 슈퍼
				KIND + "이기 때문에" 
		+ super.getMove() + "," 
				+ super.getCompany() + "제품을 가지고\n, "
				+ super.getCall() + "(이)라고 통화하고\n"
         		+ this.getSize()+"인치큰 화면을 통해서\n"
				+"카톡으로"+data+"메세지를 전달했다";
	}

	public String toString() {
		return getData();

	}

}
