import java.util.Scanner;

class HighScore {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    final int NUMBER = 5;
    int[] tensu = new int[NUMBER];
    
    System.out.println(NUMBER + "人の点数を入力せよ。");
    for (int i = 0; i < NUMBER; i++) {
      System.out.print((i + 1) + "番の点数：");
      tensu[i] = stdIn.nextInt();
    }
    
    int max = tensu[0];
    for (int i = 1; i < tensu.length; i++)
      if (tensu[i] > max) max = tensu[i];
      
    System.out.println("最高点は" + max + "点です。");
  }
}