
import java.util.Scanner;

public class home3_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first value");
        double value1 = scanner.nextDouble();
        System.out.println("Input operation");
        String operation = scanner.next();
        System.out.println("Input second value");
        double value2 = scanner.nextDouble();


        double sum;
        switch (operation) {
            case "+":
                sum = value1 + value2;
                System.out.println("result: " + sum);
                break;
            case "-":
                sum = value1 - value2;
                System.out.println("result: " + sum);
                break;
            case "/":
                sum = value1 / value2;
                System.out.println("result: " + sum);
                break;
            case "*":
                sum = value1 * value2;
                System.out.println("result: " + sum);
                break;
            case "%":
                sum = value1 / value2;
                System.out.println("result: " + sum);
                break;
            default:
                System.out.println("ERROR: You input unsupported operation");
        }

    }
}

