package school;

public class StudentServiceImpl implements StudentService{
StudentBean student=null;
	@Override
	public void registstudent(String id, String pw, String name, String ssn) {
		// 1등록
	student = new StudentBean(id, pw, name, ssn);
	}

	@Override
	public String showStudent() {
		// 2보기
		return student.toString();
	}

	@Override
	public void updateStudent(String pw) {
		// 3수정
		student.getPw();
	}

	@Override
	public void deleteStudent() {
		// 4삭제
		student = null;
	}

}
