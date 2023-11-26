// Wildcard import avoided
import java.util.Scanner;

class main {  // Class name violation: Name case convention should be PascalCase
  public static void Main(String[] args) {  // Method name violation: Name case convention should be camelCase

    char Operator; // Variable name violation: Name case convention should be camelCase
    Double Number1, Number2, Result; // Variable name violation: Name case convention should be camelCase

    Scanner Input = new Scanner(System.in); // Scanner import avoided

    System.out.println("Choose an operator: +, -, *, or /");
    Operator = Input.next().charAt(0);

    System.out.println("Enter first number");
    Number1 = Input.nextDouble();

    System.out.println("Enter second number");
    Number2 = Input.nextDouble();

    switch (Operator) {
      case '+':
        Result = Number1 + Number2;
        System.out.println(Number1 + " + " + Number2 + " = " + Result);
        break;
      case '-':
        Result = Number1 - Number2;
        System.out.println(Number1 + " - " + Number2 + " = " + Result);
        break;
      case '*':
        Result = Number1 * Number2;
        System.out.println(Number1 + " * " + Number2 + " = " + Result);
        break;
      case '/':
        Result = Number1 / Number2;
        System.out.println(Number1 + " / " + Number2 + " = " + Result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

    Input.close(); // Empty method avoided
  }
}
