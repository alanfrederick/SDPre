import java.util.Scanner;

public class SecretWord {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;
    String taco = "taco";

    System.out.print("Whats the secret word? ");
    guess = keyboard.next();

    if (guess.equals(secret) || guess.equals(taco)) {
      System.out.println("That's correct! ");
    }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }
    if(guess == secret){
      System.out.println("(This will never, ever show, no matter what.)");
    }
  }
}
