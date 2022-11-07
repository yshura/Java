import java.util.Scanner;

class EvenOdd {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("整数値:");
    int n = stdIn.nextInt();
    
    if (n <= 0)
      System.out.println("正ではない値が入力されました。");
    else
      if (n % 2 == 0)
        System.out.println("その値は偶数です。");
      else
        System.out.println("その値は奇数です。");
  }
}