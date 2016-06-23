package role;

public class  RoleMain {
	public static void main(String[] args) {
	Man[] roles = new Man[3];
	roles[0] = new Father();
	roles[1] = new Husband();
	roles[2] = new Employee();
	
	for (int i = 0; i < roles.length; i++) {
		roles[i].role();
	}
	Employee emp = (Employee) roles[2];
	emp.worry();		
	
	}
}
