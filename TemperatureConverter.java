import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter 1 for Celsius to Fahrenheit conversion\n" +
                "Enter 2 for Fahrenheit to Celsius conversion\n" +
                "Enter 1 or 2 only:");
        int choice = input.nextInt();

        if (choice == 1) {

            System.out.println("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        } else if (choice == 2) {
            
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}
