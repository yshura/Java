import java.util.Scanner;

class PointSumAveArray {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int sum = 0;
    final int NUMBER = 5;
    int[] tensu = new int[NUMBER];
    
    System.out.println(NUMBER + "人の点数を入力せよ。");
    for (int i = 0; i < NUMBER; i++) {
      System.out.print((i + 1) + "番の点数：");
      tensu[i] = stdIn.nextInt();
      sum += tensu[i];
    }
    
    System.out.println("合計は" + sum + "点です。");
    System.out.println("平均は" + (double)sum / NUMBER + "点です。");
  }
}