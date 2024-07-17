import java.util.Scanner;

class CelsiusConverter {
public static double celsiusToFahrenheit(double celsius) {
return (celsius * 9 / 5) + 32;
}
}

class FahrenheitConverter {
public static double fahrenheitToCelsius(double fahrenheit) {
return (fahrenheit - 32) * 5 / 9;
}
}

public class TemperatureConverter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int choice;

do {
System.out.println("\nMenu:");
System.out.println("1. Convert Celsius to Fahrenheit");
System.out.println("2. Convert Fahrenheit to Celsius");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();

switch (choice) {
case 1:
System.out.print("Enter temperature in Celsius: ");
double celsius = scanner.nextDouble();
double fahrenheit = CelsiusConverter.celsiusToFahrenheit(celsius);
System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
break;
case 2:
System.out.print("Enter temperature in Fahrenheit: ");
double fahrenheitInput = scanner.nextDouble();
double celsiusOutput = FahrenheitConverter.fahrenheitToCelsius(fahrenheitInput);
System.out.println(fahrenheitInput + " Fahrenheit = " + celsiusOutput + " Celsius");
break;
case 3:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice! Please enter 1, 2, or 3.");
}
} while (choice != 3);

scanner.close();
}
}