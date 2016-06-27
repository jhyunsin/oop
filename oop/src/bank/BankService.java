package bank;

/**
 * @date : 2016. 6. 27.
 * @author : 신재현
 * @file : BankService.java
 * @story :
 */

public interface BankService {

	// CREATE 11개설 (은행창구가서 개설 -> 생성자가 나중에 만들어진다)
	public abstract void openAccount(AccountBean acc);
	
	// READ 12조회 (전체)
	public String accountList();
	
	
	// READ 13조회(계좌번호)
	public String findByAccountNo(String searchAcc);
	
	
	// READ 14 조회(이름)
	public void findByName();
	
	// READ 15통장(전체통장수)
	public int count(); ///리턴값 int로 변경
	
	
	// UPDATE 16수정..사용자의 요청에 의해 비번만 전환가능
	public void updateAccount();
	
	// DELETE 17해지
	public String deleteAccount(String searchAcc);//어카운트 번호만 받는다
	
}
