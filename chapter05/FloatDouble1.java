import java.util.Scanner;

class FloatDouble1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("変数xはfloat型で変数yはdouble型です。");
    System.out.print("x:"); float  x = stdIn.nextFloat();
    System.out.print("y:"); double y = stdIn.nextDouble();
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
}