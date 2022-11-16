import java.util.Scanner;

class ReverseNo {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("正の整数値を逆順に表示します。");
    int x;
    do {
      System.out.print("正の整数値：");
      x = stdIn.nextInt();
    } while (x <= 0);
    
    System.out.print("逆から読むこと");
    while (x > 0) {
      System.out.print(x % 10);
      x /= 10;
    }
    System.out.println("です。");
  }
}