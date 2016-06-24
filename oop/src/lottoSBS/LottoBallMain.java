package lottoSBS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class LottoBallMain {
	public static void main(String[] args) {
		LottoBallService service = new LottoBallServiceImpl();
		LottoBean lot = new LottoBean();

		StringBuffer buf = new StringBuffer();

		service.setLottoBall(lot); //로또번호 생성 
		int[] lotto = service.getLottoBall(); // 번호 가져오기
		
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
			buf.append(lotto[i] + "\t");

			
		}
		
		System.out.println("로또\n" + buf);
		File output = new File("c:\\eclipse\\lotto\\LottoBall.txt");
		BufferedWriter bw = null;// set의 의미 클라스 자체가 세터다
		String[] mylotto = buf.toString().split("/");// 객체 자체를 String 값으로 바꾸는건
														// toString이다

		try {
			bw = new BufferedWriter(new FileWriter(output, true));
			for (String lots : mylotto) {
				lots += System.getProperty("line.separator");
				bw.write(lots);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.flush();// 화장실에서 물내림 작업을 끝내고 데이터값을 다 지움
				bw.close();// 화장실 문닫고 나감

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}