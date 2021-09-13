import java.util.Scanner;

public class hometask4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 words (with using commas)");
        String Str = scanner.next();
        String[] myArray = Str.split(",");
        for (int i = 0; i < myArray.length; i++) {
            // System.out.println(myArray[i]);
        }
        /*System.out.println("Please choose filter:");
        String[] myList = {"1 - maximum length", "2 - starts with", "3 - ends with", "4 - contains", "0 - exit"};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }*/

        int filter;

        do {
            System.out.println("Please choose filter:");
            String[] myList = {"1 - maximum length", "2 - starts with", "3 - ends with", "4 - contains", "0 - exit"};
            for (int i = 0; i < myList.length; i++) {
                System.out.println(myList[i] + " ");
            }

            filter = scanner.nextInt();

            switch (filter) {
                case 1:
                    System.out.println("Maximum length is : ");
                    int num1 = scanner.nextInt();
                    for (int i = 0; i < myArray.length; i++) {
                        if (myArray[i].length() <= num1) {
                            System.out.println("Result : - " + myArray[i]);
                        }
                    } break;
                case 2:
                    System.out.println("Word starts with : ");
                    String temp = scanner.next();
                    for (int i = 0; i < myArray.length; i++) {
                        if (myArray[i].startsWith(temp)) {
                            System.out.println("Result : - " + myArray[i]);
                        }
                    } break;
                case 3:
                    System.out.println("Word ends with : ");
                    String temp1 = scanner.next();
                    for (int i = 0; i < myArray.length; i++) {
                        if (myArray[i].endsWith(temp1)) {
                            System.out.println("Result : - " + myArray[i]);
                        }
                    } break;
                case 4:
                    System.out.println("Word contains : ");
                    String temp2 = scanner.next();
                    for (int i = 0; i < myArray.length; i++) {
                        if (myArray[i].contains(temp2)) {
                            System.out.println("Result : - " + myArray[i]);
                        }
                    } break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("ERROR: you input unsupported filter");
            }
        } while (filter < 5);
    }
}
