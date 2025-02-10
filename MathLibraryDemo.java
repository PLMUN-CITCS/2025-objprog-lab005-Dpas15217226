// File: MathLibraryDemo.java

public class MathLibraryDemo {
    public static void main(String[] args) {
        
        // Calculate Power
        double base = 2;        // Declare and initialize base
        int exponent = 3;       // Declare and initialize exponent
        double powerResult = Math.pow(base, exponent); // Calculate power (base raised to exponent)
        
        // Calculate Square Root
        double numberForSqrt = 16;  // Declare and initialize number for square root calculation
        double sqrtResult = Math.sqrt(numberForSqrt); // Calculate square root
        
        // Round a Decimal Number
        double decimalNumber = 5.67;   // Declare and initialize decimal number
        long roundedNumber = Math.round(decimalNumber); // Round the decimal number to the nearest whole number
        
        // Generate a Random Number
        double randomNumber = Math.random(); // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        
        // Output the Results
        System.out.println("Power: " + powerResult);            // Output power result
        System.out.println("Square Root: " + sqrtResult);       // Output square root result
        System.out.println("Rounded Number: " + roundedNumber); // Output rounded number
        System.out.println("Random Number: " + randomNumber);   // Output random number
    }
}
