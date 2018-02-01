import java.util.Scanner;

public class BMICategories {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double heightFeet, heightInches, weight, bmi1, bmi2;

//Study Drill 2, adding BMI calc vs requiring user to input raw BMI
    System.out.print( "Your height (feet only): ");
    heightFeet = keyboard.nextDouble();

    System.out.print( "Your height (inches only): ");
    heightInches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    weight = keyboard.nextDouble();

    double footInchConvert = heightFeet * 12;
    double totalHeightInInches = footInchConvert + heightInches;

    bmi1 = weight / Math.pow(totalHeightInInches, 2);
    bmi2 = bmi1 * 703;

    System.out.println( "Your BMI is: " + bmi2);

    System.out.print("BMI Category: ");
    if(bmi2 < 15.0){
      System.out.println("very severely underwight ");
    }
    else if(bmi2 <= 16.0){
      System.out.println("severely underweight ");
    }
    else if(bmi2 < 18.5){
      System.out.println("underweight ");
    }
    else if(bmi2 < 25.0){
      System.out.println("normal weight ");
    }
    else if(bmi2 < 30.0){
      System.out.println("overweight ");
    }
    else if(bmi2 < 35.0){
      System.out.println("severely obese");
    }
    else if(bmi2 < 40.0){
      System.out.println("very severley/\"morbidly\" obese");
    }
  }
}
