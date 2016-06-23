package lotto.copy;

import javax.swing.JOptionPane;

public class LottoMain {
/**
 * 7900을 입력해도 getMoney에서는 7을 추출해야 한다
 * 겟머니에서 
 * */
	public static void main(String[] args) {
	LottoService service = new LottoServiceImpl();
	LottoBean lot = new LottoBean();
		JOptionPane.showInputDialog("얼마나 구입?");
				lot.setMoney(5800);
		service.setLottos(lot);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
		//	service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.println(lottos[i][j]+"\t");
			}
		System.out.println();
		}
			
		
	}


}

