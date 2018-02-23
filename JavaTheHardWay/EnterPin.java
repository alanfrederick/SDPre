import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String typedPassword;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("PLEASE ENTER YOUR PASSWORD");
    typedPassword = keyboard.next();

    while (! typedPassword.equals("hunter2") /*all i see is ****** */ ) {
      System.out.println("\nINCORRECT PASSWORD.  TRY AGAIN.");
      System.out.println("\nENTER YOUR PASSWORD: ");
      typedPassword = keyboard.next();
    }

    System.out.println("ENTER YOUR PIN:  ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN.  TRY AGAIN. ");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nCREDENTIALS ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
  }
}
