
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
      // 指定の家電だとttにあを代入
    case "パソコン":
        tt ="あ";
        break;
    case "冷蔵庫":
        tt ="あ";
        break;
    case "洗濯機":
        tt ="あ";
        break;
    case "加湿器":
        tt ="あ";
        break;
    case "扇風機":
        tt ="あ";
        break;
    case "テレビ":
        tt ="あ";
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
        break;
        default:
      // 指定以外の家電の処理
        tt ="い";
            System.out.println(tokens[i]+"は指定の商品ではありません");
         }
         // テレビ、ディスプレイ片方のみまたは指定の家電以外だと出力しない
         switch(tt){
             case "い":
                 tt = "あ";
                break;
 default:
            //テレビ、ディスプレイ片方のみまたは指定の家電だと出力（ttに、い以外がが代入されていると出力）
        System.out.println(tokens[i]+"の残り台数は"+num+"です");
        tt = "あ";
    }
    }
}
}



