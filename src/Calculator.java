import java.util.Objects;
import java.util.Scanner;
public class Calculator {

    public Calculator() {
        Scanner input = new Scanner(System.in);
        int parameterCounter = 0;
        if (Objects.equals(input.next(), "enter")){


        } else {
            parameterCounter++;
            System.out.println("Enter number " + parameterCounter);
            double[] calculations = new double [1000];
            
        }

        System.out.println("Enter first number: ");
        double firstCalculation = input.nextDouble();
        System.out.println("enter second number:");
        double secondCalculation = input.nextDouble();
        System.out.println("Enter desired operation:");
        String operation = input.next();
        
        double output = 0;
        if (Objects.equals(operation, "+")) {
            output = firstCalculation + secondCalculation;
        }
        if (Objects.equals(operation, "-")) {
            output = firstCalculation - secondCalculation;
        }
        if (Objects.equals(operation, "*")) {
            output = firstCalculation * secondCalculation;
        }
        if (Objects.equals(operation, "/")) {
            output = firstCalculation / secondCalculation;
        }

        System.out.println(output);

    }



}
