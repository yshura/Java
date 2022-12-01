import java.util.Scanner;
import java.util.Random;

class FingerFlashing {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    String[] hands = {"グー", "チョキ", "パー"};
    int retry;
    
    do {
      int comp = rand.nextInt(3);
      int user;
    
      do {
        System.out.print("じゃんけんぽん");
        for (int i = 0; i < 3; i++)
          System.out.printf("(%d)%s", i, hands[i]);
        System.out.print("：");
        user = stdIn.nextInt();
      } while (user < 0 || user > 2);
      
      System.out.printf("私は%sで、あなたは%sです。\n", hands[comp], hands[user]);
      
      int judge = (user - comp + 3) % 3;
      switch (judge) {
        case 0: System.out.println("引き分けです。"); break;
        case 1: System.out.println("あなたの負けです。"); break;
        case 2: System.out.println("あなたの勝ちです。"); break;
      }
      
      do {
        System.out.print("もう一度？　(0)いいえ (1)はい：");
        retry = stdIn.nextInt();
      } while (retry != 0 && retry != 1);
    } while (retry == 1);
  }
}