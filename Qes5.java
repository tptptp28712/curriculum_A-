
package curriculum_B;
mport java.util.Random;
import java.util.Scanner;
public class  Qes5{
	public static void main( String[] args ) {
	    int s;
		// 九九の計算
		for ( int i = 1; i <= 9; i ++ ) {
		    // 九九の計算
			for ( int j = 1; j <= 20; j ++ ) {
			    // 桁数指定
			    String ii = String.format("%03d", i);
			    String jj = String.format("%03d", j);
			    s = i * j;
			    String ss = String.format("%03d", s);
			    // 出力
			    System.out.print( jj+"*"+ii +"="+ ss +"|| ");
			}
			// 改行
			System.out.println();
		}
	}
}
