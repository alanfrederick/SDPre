import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 15;
    Scanner input = new Scanner(System.in);

    if(num1 > num2) {
      out.print(num1 + " is greater than " + num2);
    }
    else if(num2 > num1) {
      out.print(num2 + " is greater than " + num1);
    }
    out.println();
  }
}
