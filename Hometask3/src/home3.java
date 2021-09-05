import java.util.Scanner;

public class home3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input first value");
            double value1 = scanner.nextDouble();
            System.out.println("Input operation");
            String operation = scanner.next();
            System.out.println("Input second value");
            double value2 = scanner.nextDouble();


            double sum;
            if (operation.equals("+")) {
                sum = value1 + value2;
                System.out.println ("result: " +sum);
                } else if (operation.equals("-")) {
                sum = value1 - value2;
                System.out.println ("result: " +sum);
                } else if (operation.equals("/")) {
                sum = value1 / value2;
                System.out.println ("result: " +sum);
                } else if (operation.equals("*")) {
                sum = value1 * value2;
                System.out.println ("result: " +sum);
                } else if (operation.equals("%")) {
                sum = value1 % value2;
                System.out.println ("result: " +sum);
                }
            else {
                System.out.println("ERROR: you input unsupported operation");
            }
        }
    }

