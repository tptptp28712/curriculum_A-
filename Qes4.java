# curriculum_B
package curriculum_B;
public class Qes4 {
	public static void main( String[] args ) {
	    int s;
		// 九九の計算
		for ( int i = 1; i <= 9; i ++ ) {
		    // 九九の計算
			for ( int j = 1; j <= 9; j ++ ) {
			    // 桁数指定
			    String ii = String.format("%02d", i);
			    String jj = String.format("%02d", j);
			    s = i * j;
			    String ss = String.format("%02d", s);
			    // 出力
			    System.out.print( ii+"*"+jj +"="+ ss +"|| ");
			}
			// 改行
			System.out.println();
		}
	}
} 
