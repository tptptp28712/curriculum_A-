
package curriculum_B;
import java.util.Scanner;
import java.util.Random;
class Qes6{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
Random rand = new Random();
   int num;
    String hobby = scanner.nextLine();
    String[] tokens = hobby.split(",");
    int b;
    int i;
    String tt ="あ";
    for (i = 0 ; i < tokens.length; i++){
         num = rand.nextInt(12);
switch(tokens[i]){
    case "テレビ":
        // テレビの前にディスプレイがないか確認
        for ( b = i ; b < 0; b--){
            switch(tokens[b]){
                case "ディスプレイ":
                break;
            }
        }
        // 後にディスプレイがあると並んで出力
        for ( b = i ; b <tokens.length ; b++){
            switch(tokens[b]){
                case "ディスプレイ":
                System.out.println("テレビ"+"の残り台数は"+num+"です");
            num = rand.nextInt(12);
            System.out.println("ディスプレイ"+"の残り台数は"+num+"です");
            }
            }
            // 前後にディスプレイがあるか判定
            for ( b = 0 ; b < tokens.length; b++){
             switch(tokens[b]){
                case "ディスプレイ":
                     tt ="い";
         }
        }
            break;
  case "ディスプレイ":
      // ディスプレイの前にテレビがないか確認
          for ( b = i - 1; b < 0; b--){
            switch(tokens[b]){
                case "テレビ":
            }
        }
        // 後にテレビがあると並んで出力
        for ( b = i + 1; b <tokens.length ; b++){
            switch(tokens[b]){
                case "テレビ":
                System.out.println("ディスプレイ"+"の残り台数は"+num+"です");
                num = rand.nextInt(12);
                System.out.println("テレビ"+"の残り台数は"+num+"です");
            num = rand.nextInt(12);
            }
        }// 前後にテレビがあるか判定
         for ( b = 0 ; b < tokens.length; b++){
             switch(tokens[b]){
                case "テレビ":
                     tt ="い";
         }
        }
         }
         // テレビ、ディスプレイ片方のみまたはそれ以外だと出力
         switch(tt){
             case "い":
                 tt = "あ";
                break;
 default:
        System.out.println(tokens[i]+"の残り台数は"+num+"です");
        tt = "あ";
    }
    }
}
}


