package Matrix;

public class MatrixMul5 {
public static void main(String[] args) {
//	
//	int a = 0;
//	for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 5; j++) {
//			a+=5;
//			System.out.print(a + "\t");
//
//		}
//		System.out.println();
//	}

int [][]mtx = new int[5][5];
int k= 0;
for (int i = 0; i < 5 ; i++) {
	for (int j = 0; j < 5; j++) {
		k+=5;
		mtx[i][j]=k;
	System.out.printf(mtx[i][j]+"\t");
	}
System.out.println();
}






}}

