import java.util.Objects;
import java.util.Scanner;
public class Calculator {
    Scanner input = new Scanner(System.in);
    int parameterCounter = 1;
    double temporaryOutput;
    double[] calculations = new double [1000];
    String[] operators = new String [1000];
    String temp = "hi";
    public Calculator() {

        System.out.println("calculator follows chronological order of operations");
        inputCollecting();
        calculating();
    }
    public void calculating() {
        if (Objects.equals(input.next(), "enter")){

            if(Objects.equals(operators[1], "+"))
                temporaryOutput = calculations[1]+calculations[2];
            if(Objects.equals(operators[1], "-"))
                temporaryOutput = calculations[1]-calculations[2];
            if(Objects.equals(operators[1], "*"))
                temporaryOutput = calculations[1]*calculations[2];
            if(Objects.equals(operators[1], "/"))
                temporaryOutput = calculations[1]/calculations[2];

            for(int x=2; x<=parameterCounter; x++){
                if(Objects.equals(operators[x],"+"))
                    temporaryOutput = temporaryOutput+calculations[x+1];
                if(Objects.equals(operators[x],"-"))
                    temporaryOutput = temporaryOutput-calculations[x+1];
                if(Objects.equals(operators[x],"*"))
                    temporaryOutput = temporaryOutput*calculations[x+1];
                if(Objects.equals(operators[x],"/"))
                    temporaryOutput = temporaryOutput/calculations[x+1];
            }
            System.out.println(temporaryOutput);
        } else {
           inputCollecting();
        }
    }

    public void inputCollecting() {
        System.out.println("Enter input " + parameterCounter);

        calculations[parameterCounter] = Double.parseDouble(input.next());
        System.out.println("enter operation or say 'enter' if done:");
        temp = input.next();
        if(Objects.equals(temp, "+")||Objects.equals(temp, "-")||Objects.equals(temp, "*")||Objects.equals(temp, "/"))
            operators[parameterCounter] = input.next();
        else { System.out.println("invalid operator; please use +,-,*,/"); }
        parameterCounter++;
        calculating();
    }
}
