import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    currentYear = 2018; //only works if your birthday is on or before this date

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);

    input.close();
  }
}
