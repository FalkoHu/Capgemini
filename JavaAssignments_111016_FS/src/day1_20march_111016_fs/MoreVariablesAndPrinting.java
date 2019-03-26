package day1_20march_111016_fs;

public class MoreVariablesAndPrinting {
	public static void main( String[] args )
	{
		String name, eyes, teeth, hair;
		int age, height, weight;
		double heightCentimeter, weightKilo;
		
		name = "Zed A. Shaw";
		age = 35; // not a lie
		height = 74; // inches
		heightCentimeter = height * 2.54; // centimeter
		weight = 180; // lbs
		weightKilo = weight * 0.45359237; //kilos
		eyes = "Blue";
		teeth = "White";
		hair = "Brown";
		
		System.out.println( "Let's talk about " +name + "." );
		System.out.println( "He's " + height + " inches (or " + heightCentimeter + " cm) tall." );
		System.out.println( "He's " + weight + " pounds (or " + weightKilo + " kg) heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
		System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + age + ", " + height + ", and "
		+ weight
		+ " I get " + (age + height + weight) + "." );
	}
	
	/*
	 * 3: No, variables can only start with a letter, underscore character _ or a dollar sign character $. 
	 * 
	 * 4: You can round a float to the nearest integer or long data type by using Math.round() method.
	 *
	 * 
	 */
}
