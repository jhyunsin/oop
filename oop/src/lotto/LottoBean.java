package lotto;

import java.util.Random;

public class LottoBean {
	private int money, number;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getNumber() {
	//	this.setNumber(); 겟넘 할때 자동으로 셋넘 같이 하게 하기
		return number;
	}

	public void setNumber() {
		this.number = new Random().nextInt(45) + 1;

		// 로또를 구성하는 랜덤숫자 하나 발생 후 6바퀴를 돌아서 6숫자 한줄을 완성

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LottoBean [money=" + money + ", numer=" + number + "]";
	}

}
