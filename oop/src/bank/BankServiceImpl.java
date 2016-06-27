package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date : 2016. 6. 27.
 * @author : 신재현
 * @file : BankServiceImpl.java
 * @story :
 */

public class BankServiceImpl implements BankService { // 은행전체

	List<AccountBean> list;
	AccountBean account;
	/// AccountBean[] bean = new AccountBean[3];

	public BankServiceImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<AccountBean>();
	}

	@Override
	public void openAccount(AccountBean acc) { // add size 생성자가 아니라 setter
		// 11개설 - 은행창구개설 (한장에 담아서)
		list.add(acc);
		// this.bean[0] = bean;

	}

	@Override
	public String accountList() {
		// 12계좌조회전체
		return list.toString();
	}

	@Override
	public String findByAccountNo(String searchAcc) {
		// 13계좌번호조회
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(searchAcc) == list.get(i).getAccountNo()) {
				result = list.get(i).toString();
			break;
			} else {
				result = "계좌가 없습니다";
			}
		}

		return result;

		
	}

	@Override
	public void findByName() {
		// 14 이름조회 리턴타입을 객체로 받아라...

	}

	@Override ////////////////////////////////////////////
	public int count() {
		// 15 계좌수
		return list.size();
		// 1차원 lotto.length 2차원 lotto.length

	}

	
	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteAccount(String searchAcc) {
		
	return "";
	}

}
