// Convert Temperature
// Declare a variable "temperature" and initialise it with a value of 25.5 (in Celsius) and Print it in Celsius and Kelvin(add 273 to temperature in Celsius).
// Print the output in the same format as given below.(there is a single space around - (hyphen))

// Sample 1:
// Input
// Output
// Celsius - 25.5  
// Kelvin - 298.5  


public class Main {
    public static void main(String[] args) {
        float temperature = 25.5f;
        System.out.println("Celsius - "+ temperature);
        temperature=temperature+273;
        System.out.println("Kelvin - "+ temperature);
    }
}