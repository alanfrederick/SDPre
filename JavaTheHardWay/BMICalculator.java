
//Original from Book

import java.util.Scanner;

public class BMICalculator {
  public static void main( String [] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;

    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);

  }
}

// Study Drill 1 using same formula just converting Standard to Metric

import java.util.Scanner;

public class BMICalculator {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double inches, pounds, bmi;


    System.out.print( "Your height in inches: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    //metric conversion
    double inchConvert = inches / 39.370;
    double poundConvert = pounds / 2.2046;


    bmi = poundConvert / Math.pow(inchConvert, 2);

    System.out.println( "Your BMI is " + bmi);
  }
}


// Study Drill 2

import java.util.Scanner;

public class BMICalculator {
  public static void main( String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double heightFeet, heightInches, weight, bmi1, bmi2;


    System.out.print( "Your height (feet only): ");
    heightFeet = keyboard.nextDouble();

    System.out.print( "Your height (inches only): ");
    heightInches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    weight = keyboard.nextDouble();

    //convert feet to inches
    double footInchConvert = heightFeet * 12;
    double totalHeightInInches = footInchConvert + heightInches;

    //wasnt sure how to multiply by 703 on same line, created bmi1&2
    bmi1 = weight / Math.pow(totalHeightInInches, 2);
    bmi2 = bmi1 * 703;

    System.out.println( "Your BMI is: " + bmi2);

  }
}
