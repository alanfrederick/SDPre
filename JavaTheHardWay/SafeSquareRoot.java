import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String properAnswer;

    System.out.println("Are you ready!? ");
    properAnswer = keyboard.next();
//Study Drill
    while (! properAnswer.equals("YES!")) {
      System.out.print("You have to say \"YES!\" to prove you are ready!");
      System.out.println("\nAre you ready!? ");
      properAnswer = keyboard.next();
    }

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please)");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative. ");
      System.out.print("\nNew Number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}
