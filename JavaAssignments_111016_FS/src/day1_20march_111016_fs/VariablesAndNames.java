package day1_20march_111016_fs;

public class VariablesAndNames {


	public static void main( String[] args )
	{
		// We are declaring different integers/numbers here. separating them by a comma.
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		
		// We are declaring different doubles here. separating them by a comma.
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		//the next lines we are initializing the variables we declared above. Basically we are giving them a set number.
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		
		// We are initializing the cars_not_driven with a mathematical expression. basically given it the number cars(100) subtracted by drivers(30)
		cars_not_driven = cars - drivers;
		
		//We are initializing the cars_driven to the number of the variable drivers(30)
		cars_driven = drivers;
		
		// We are initializing the carpool_capacity with a mathematical expression. given it the cars_driven number multiplied by space_in_a_car number.
		carpool_capacity = cars_driven * space_in_a_car;
		
		//// We are initializing the carpool_capacity with a mathematical expression. given it the cars_driven number multiplied by space_in_a_car number.
		average_passengers_per_car = passengers / cars_driven;
		//In the next couple of lines we are outputting text with the different integer or double variables by using System.out.println. 
		//The text has to be written within double quotation marks which makes them Strings and the variables just with their same name outside of the quotations marks. 
		// we are able to write the text and the variables in the same System.out.println by using the plus sign. 
		System.out.println( "There are " + cars + " cars available." );
		System.out.println( "There are only " + drivers + " drivers available." );
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today." );
		System.out.println( "We have " + passengers + " to carpool today." );
		System.out.println( "We need to put about " +
		average_passengers_per_car + " in each car." );
		
		System.out.println(space_in_a_car);
	}
	
	/* 1: Because the variable is of data type double, which uses decimal points it does not matter if we specify 4.0 or 4
	 * 
	 * 2: Floating point number are numbers that have fractional parts/decimal numbers
	 * 
	 * 6: Single equals sign is used when we assign a value to a variable while double equals sign is used to check some condition
	 *		such if two variables are the same number 
	 */
}
