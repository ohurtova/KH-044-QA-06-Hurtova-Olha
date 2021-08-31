import java.util.Scanner;

public class Exersize1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
    }
}
