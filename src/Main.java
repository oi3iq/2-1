import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter a degree in Celsius: ");
        celsius = scanner.nextDouble();  

        System.out.println("The Celsius degree is " + celsius);

       
        fahrenheit = (9.0 / 5) * celsius + 32;

       
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        
        scanner.close();
    }
}