package role;

public class Employee extends Man{

	@Override
	public void role() {
	System.out.println("직원의 역할");
	}
	public void worry(){
		System.out.println("직원의 고민");
}
}