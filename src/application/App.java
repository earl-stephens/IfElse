package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter room temperature (F) > ");

		double temperatureFahrenheit = scanner.nextFloat();
		scanner.close();
		
		double temperatureCelsius = (temperatureFahrenheit - 32) * (5.0 / 9.0);
		
		System.out.printf("Temperature Celsius %.2f", temperatureCelsius);
	}

}
