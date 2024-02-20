package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int result = 0;
    		int serifu2 = 0;
	/*-------------------------------------------------------------------------
	ログイン時の入力チェックシステムを下記条件で作成してください
	・コンソールにユーザー名を入力できるようにしてください
	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
	-------------------------------------------------------------------------*/
	        // ユーザー名を入力してくださいと表示
	        System.out.print("ユーザー名を入力してください: ");
	        // コンソールにユーザー名を入力
	        String inputUsername = scanner.nextLine();
	        // ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
	         if(inputUsername.length() == 0 || inputUsername == null) {
	            System.out.println("名前を入力してください");
	        }
	        // ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
	        if(inputUsername.length() >= 10 && inputUsername.length() != 0) {
	            System.out.println("名前を10文字以内にしてください");
	        }
	        // ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
	        // ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
	        if (inputUsername.matches("^[A-Za-z0-9]+")){
	             if(inputUsername.length() < 10 && inputUsername.length() != 0) {
	            System.out.println("ユーザー名「 入力したユーザー名 」を登録しました");
	         // 結果の変数を用意
	    		result = 0;
	    		serifu2 = 0;
	    		String name3 = inputUsername;
	    		
	    		//Scannerのインスタンス化
	    		Scanner stdin = new Scanner(System.in);
	    		
	    		do {
	    			
	    			// ユーザーの手を読み取る
	    			int userHands = stdin.nextInt();
	    			
	    	        // 入力チェック
	    	        while (userHands < 0 || userHands > 2) {
	    	         
	    	            userHands = stdin.nextInt();
	    	        }
	    			// PCのじゃんけんの手を準備
	    			Random rand = new Random();
	    			int pcHands = rand.nextInt(3);
	    			//結果判定
	    			result = (userHands - pcHands + 3) % 3;
	    			String winOrLose = null;
	                       String serifu = null;
	    			if (result == 2) {
	    				winOrLose = "やるやん。";
	                              serifu = "次は俺にリベンジさせて";
	                              serifu2 = serifu2 + 1;
	    			} else if (result == 1) {
	    				winOrLose = "僕の勝ち";
	    				serifu2 = serifu2 + 1;
	    if(pcHands == 0){
	    serifu = "負けは次につながるチャンスです！";
	    }
	    if(pcHands == 1){
	    serifu = "たかがじゃんけん、そう思ってないですか？";
	    
	    }
	    if(pcHands == 2){
	    serifu = "なんで負けたか、明日まで考えといてください。";
	    
	    }
	    			}else{
	    				winOrLose = "あいこ";
	    				serifu2 = serifu2 + 1;
	    serifu =  "もう一回しましょう！";
	    			}
	    			// 判定結果の表示
	    			String[] hands = { "グー", "チョキ", "パー" };
	    			System.out.println(name3+"の手は「" + hands[userHands] + "」" );
	    			System.out.println("コンピュータの手は「" + hands[pcHands]+"」");
	    			System.out.println(winOrLose);
	                System.out.println(serifu);
	                if(result == 2 ){
	                    System.out.println("勝つまでにかかった合計回数は"+serifu2+"回です");
	                }
	                
	    			// あいこ、負けの場合は繰り返す
	    		} while (result <= 1 );
	    		
	    		stdin.close();
	    	
	    		
	             }
	        }
	        else{
	            System.out.println("半角英数字のみで名前を入力してください");
	        }
	        scanner.close();
	    }
	}
