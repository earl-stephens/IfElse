package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter room temperature (F) > ");

		double temperatureFahrenheit = scanner.nextFloat();
		scanner.close();
		
		double temperatureCelsius = (temperatureFahrenheit - 32) * (5.0 / 9.0);
		
		System.out.printf("Temperature Celsius %.2f\n", temperatureCelsius);
		
		/* Coding challenge:
		 * if temperature is greater than 21C, output "Too warm"
		 * if temperature is less than 21C, output "Too cold"
		 * if temperature is equal to 21C, output "Just right"
		 */
		
		/*
		 * if(temperatureCelsius > 21.0) {
			System.out.println("Too warm");
		}
		
		if(temperatureCelsius < 21.0) {
			System.out.println("Too cold");
		}
		
		if(temperatureCelsius == 21.0) {
			System.out.println("Just right");
		}
		*/
		
		if(temperatureCelsius < 21) {
			System.out.println("Too cold");
		}
		else {
			System.out.println("Warm enough");
		}
		//Either the if or the else code block will be executed
	}

}
