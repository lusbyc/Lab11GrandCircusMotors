import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numOfCars = 0;
		String userInput;
		int userInputInt;
		double userInputDouble;
		
		ArrayList<Car> carList = new ArrayList<>();  
		
		Car dummy;
		
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering: ");
		numOfCars = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		for (int i = 0; i < numOfCars; i++) {
			dummy = new Car();
			System.out.println("Enter Car #" + (i+1) + " Make: " );
			userInput = scan.next();
			dummy.setMake(userInput);
			System.out.println();
			
			System.out.println("Enter Car #" + (i+1) + " Model: " );
			userInput = scan.next();
			dummy.setModel(userInput);
			System.out.println();
			
			System.out.println("Enter Car #" + (i+1) + " Year: " );
			userInputInt = scan.nextInt();
			dummy.setYear(userInputInt);
			System.out.println();

			System.out.println("Enter Car #" + (i+1) + " Price: " );
			userInputDouble = scan.nextDouble();
			dummy.setPrice(userInputDouble);
			carList.add(dummy);
			System.out.println();
			
			System.out.println("Thanks. Let's continue...");
			System.out.println();
			
		}
		
		System.out.println("Current Inventory: ");
		for (Car car : carList) {
			System.out.println(car);	
			
		}
		
		scan.close();
		
		
	}

}
