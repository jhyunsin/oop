package lottoSBS;

import java.util.Random;

public class LottoServiceImpl implements LottoService {

	private int[][] lottos;// 공유영역
	private int[] lotto;// 게임간의 중복은 허락하지만 게임 안의 중복이 안되기 때문에!!
	private int count;// 돈에 따른 회전수

	@Override
	public void setLottos(LottoBean lot) { 
		// 회전수를 입력받아서 매트릭스로 로또추첨

		this.count= this.count(lot);//
		this.lottos = new int[count][6];
		this.lotto = new int[6];

		int i = 0;
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {///랜덤숫자가 몇개가 나올지 몰라서 리밑값이 없어서 와일로 돌림
					lot.setNumber();
					int num=lot.getNumber();// 
					 if (this.isDuplication(count, num)) { 
						 
						 continue; /// 중복됐으니까 다 시 계산해라
					 
					 }
					this.lottos[count][i] = num; // 이미 중복되지 않은 것을 알고 있다
					i++;///우측으로 한칸 더 이동해라
					
					  if (i == lottos[count].length) {
					  i=0;
					  break;
					  }
					 
				}
			}
		}
	}

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다
		return lottos;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		// 중복방지(완성0
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] lot) {
		// 오름차순으로 정렬(한단위)
		for (int i = 0; i < lot.length - 1; i++) {/// 
			
			for (int j = 0; j < lot.length - i - 1; j++) {
				if (lot[j] > lot[j + 1]) {
				int temp = lot[j];
				lot[j]=lot[j+1];
				lot[j+1] = temp;
				}
			}
		}
	}

	@Override
	public int count(LottoBean lot) {
		// 회전수 구하기

		return lot.getMoney()/1000;
		// 1000단위 횧수를 추출하도록 편집
	}

}
