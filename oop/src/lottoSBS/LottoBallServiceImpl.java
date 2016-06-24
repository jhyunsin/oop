package lottoSBS;

import java.util.Random;

public class LottoBallServiceImpl implements LottoBallService {
	private int[] lotto; /// 공유필드 만들기

	@Override
	public void setLottoBall(LottoBean lot) {
		// 중복방지 해서 어레이 하나 추출하기
		// 1for문으로 끝내기
	this.lotto = new int[6];
		
	int i =0;
	while (true) {///랜덤숫자가 몇개가 나올지 몰라서 리밑값이 없어서 와일로 돌림
		int num=lot.getNumber();// 
		 if (this.isDuplication(num)) { 
			 
			 continue; /// 중복됐으니까 다 시 계산해라
		 
		 }
		this.lotto[i] = num; // 이미 중복되지 않은 것을 알고 있다
		i++;///우측으로 한칸 더 이동해라
		
		  if (i == lotto.length) {
		  i=0;
		  break;
		  }
		 
	}
	 
	
		
	}
	
	
	public boolean isDuplication( int num) {
		// 중복방지(완성0
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public int[] getLottoBall() {
		// TODO Auto-generated method stub
		return lotto;
	}

}
