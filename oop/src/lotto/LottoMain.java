package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JOptionPane;

public class LottoMain {
	/**
	 * 7900을 입력해도 getMoney에서는 7을 추출해야 한다 겟머니에서
	 */
	public static void main(String[] args) {
		LottoService service = new LottoServiceImpl();
		LottoBean lot = new LottoBean();
		
		StringBuffer buf = new StringBuffer();
		
		String input = JOptionPane.showInputDialog("얼마나 구입?");
		lot.setMoney(Integer.parseInt(input));
		service.setLottos(lot);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			 service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j]+"\t");
			}
			buf.append("\n");
		}
		System.out.println("로또\n"+buf);
	int LottoSerialNo = (int) (Math.random()*999999+100000);
	File output = new File("c:\\eclipse\\lotto\\"+LottoSerialNo+".txt");
	BufferedWriter bw=null;//set의 의미 클라스 자체가 세터다
	String[] mylotto = buf.toString().split("/");//객체 자체를 String 값으로 바꾸는건 toString이다
	

	try {
		bw = new BufferedWriter(new FileWriter(output,true));
		for(String lots : mylotto){
		lots +=System.getProperty("line.separator");
        bw.write(lots);
		}
			} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	try {
		bw.flush();//화장실에서 물내림 작업을 끝내고 데이터값을 다 지움
		bw.close();//화장실 문닫고 나감
  
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	
	
	
	
	
	
	}

}
