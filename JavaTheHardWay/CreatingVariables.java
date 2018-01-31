public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, time;
		double seconds, e, checking, savings;
		String firstName, lastName, title, street, city;

		x = 10;
		y = 400;
		age = 39;
		time = 1400;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 5.98;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		street = "Missy";
		city = "Atlanta";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $ " + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "The time is " + time + " , and I grew up on " + street + " St. in " + city ); 


	}
}