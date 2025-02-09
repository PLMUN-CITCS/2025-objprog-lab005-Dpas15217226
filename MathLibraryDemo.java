import java.util.Random;

public class MathLibraryDemo {
  public static void main(String[] args) {
    // Given number
    double number = 4;

    // Power calculation (number raised to the power of 2)
    double power = Math.pow(number, 2);

    // Square root calculation
    double squareRoot = Math.sqrt(number);

    // Rounding the number (rounding to the nearest integer)
    long roundedNumber = Math.round(number);

    // Generating a random number between 0 and 1
    Random random = new Random();
    double randomNumber = random.nextDouble(); // Random number between 0.0 and 1.0

    // Display the results
    System.out.println("Power: " + power);
    System.out.println("Square Root: " + squareRoot);
    System.out.println("Rounded Number: " + roundedNumber);
    System.out.println("Random Number: " + randomNumber);
  }
}
