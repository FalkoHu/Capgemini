package day1_20march_111016_fs;

public class NumbersAndMath {

	public static void main(String[] args) {
	System.out.println( "I will now count my chickens:" );
	
	// Adding 25 and 30 and divides it by 6
	System.out.println( "Hens " + ( 25f + 30f / 6f ) );
	
	// Modulus and division have equal precedence so they are read left to right and have precedence over addition and subtraction.
	// It multiplies 25 times 3 which is 75 and then uses modulus to return the reminder of divided by 4 which gives us a reminder of 3. 
	// It then subtracts 3 of 100 which gives us 97
	System.out.println( "Roosters " + ( 100f - 25f * 3f % 4f ) );
	
	System.out.println( "Now I will count the eggs:" );
	// Modulus and division have equal precedence so they are read left to right and have precedence over addition and subtraction. 
	// So first we calculate 4 modulus 2 which gives us 0. 
	// then we divide 1/4 which gives us 0.25.
	// After the addition and subtraction has equals precedence so they are read from left to right which gives us 6.75
	System.out.println( 3f + 2f + 1f - 5f + 4f % 2f - 1f / 4f + 6f );
	System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
	
	//it uses and boolean expression to check if 5 is less than -2, as it is not it is false
	System.out.println( 3f + 2f < 5f - 7f );
	
	//it additions 3 and 2. 
	System.out.println( "What is 3 + 2? " + ( 3f + 2f ) );
	//it subtracts 5 with 7
	System.out.println( "What is 5 - 7? " + ( 5f - 7f ) );
	System.out.println( "Oh, that's why it's false." );
	System.out.println( "How about some more." );
	
	//it uses boolean expression to check if 5 is greater than -2, as it is it shows true
	System.out.println( "Is it greater? " + ( 5f > -2f ) );
	//it uses boolean expression to check if 5 is greater or equal to -2, as it is greater it shows true
	System.out.println( "Is it greater or equal? " + ( 5f >= -2f )
	);
	
	//it uses boolean expression 
	System.out.println( "Is it less or equal? " + ( 5f <= -2f ) );
	}
	
	/* 2: floating point number are numbers that have fractional parts/decimal numbers
	 * 
	 * 4: In Java the % sign is the mathematical expression modulus
	 * 
	 * 
	 * 5: modulus is the expression that returns the reminder of two divided numbers
	 * 
	 * 6: The operator precedence of / * % is left-associative which means they are read from left to right. they however take precedence over 
	 *		+ and -. The addition and subtraction are left-associative between themselves so they are read from left to right.
	 * 
	 * 7: It gets rounded down when we divide integer numbers as the reminder gets cut off.
	 */
}
