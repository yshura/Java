import java.util.Scanner;

class Sign {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("整数値:");
    int n = stdIn.nextInt();
    
    if (n > 0)
      System.out.println("その値は正です。");
    else if (n < 0)
      System.out.println("その値は負です。");
    else
      System.out.println("その値は0です。");
  }
}