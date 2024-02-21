package curriculum_B;
import java.util.Scanner;
import java.util.Random;
public class Qes7 {
public static void main(String aregs[]) {
Scanner scanner = new Scanner(System.in);
	    			int sum = 0;
	    			int sum2= 0;
	    			int rika = 0;
	    			int syakai = 0;
	    			int su = 0;
	    			int gou = 0;
	    			int s1 =0;
	    			int s2 =0;
	    			int s3 =0;
	    			int s4 =0;
	    			//生徒の人数入力
	    			System.out.print("生徒の人数を入力してください（2以上）: ");
	    			sum2 = scanner.nextInt();
	    			int[] num3 = new int[sum2];
	    			//人数分繰り返し
	    			for (int i = 0; i < sum2; i++) {
	    			//英語の点数入力
	    			System.out.print(i + 1 + "人目の『英語』の点数を入力してください :");
	    			sum = scanner.nextInt();
	    			s1 += sum;
	    			num3[i] = num3[i]+sum;
	    			//数学の点数入力
	    			System.out.print(i + 1 + "人目の『数学』の点数を入力してください :");
	    			su = scanner.nextInt();
	    			num3[i] = num3[i]+su;
	    			s2 += su;
	    			// 理科の点数入力
	    			System.out.print(i + 1 + "人目の『理科』の点数を入力してください :");
	    			rika = scanner.nextInt();
	    			num3[i] = num3[i]+rika;
	    			s3 += rika;
	    			//社会の点数入力
	    			System.out.print(i + 1 + "人目の『社会』の点数を入力してください :");
	    			syakai = scanner.nextInt();
	    			num3[i] = num3[i]+syakai;
	    			gou += num3[i];
	    			s4 += syakai;
	    			}
	    			//人数分の平均点出力
	    			for (int i = 0; i < sum2; i++) {
	    			System.out.println(i + 1 + "人目の平均点は"+num3[i] / 4+"点です。");
	    			//各教科と全体の平均出力    
	    			}
	    			System.out.println("");
	    			System.out.println("英語の平均点は" + String.format("%.2f",(double)s1 / (double)sum2)+"点です。");
	    			System.out.println("数学の平均点は" + String.format("%.2f",(double)s2 / (double)sum2)+"点です。");
	    			System.out.println("理科の平均点は" + String.format("%.2f",(double)s3 / (double)sum2)+"点です。");
	    			System.out.println("社会の平均点は" + String.format("%.2f",(double)s4 / (double)sum2)+"点です。");
	    			System.out.println("全体の平均点は" + String.format("%.2f",(double)gou / ((double)sum2*4))+"点です。");
	    			scanner.close();
	    			}
	    			}
