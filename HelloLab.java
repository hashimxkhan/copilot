import java.util.Scanner;

public class HelloLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! Please enter your Lab number in the form LXX:");
        int labNumber = Integer.parseInt(scanner.nextLine().substring(1));
        System.out.printf("Welcome to L%d!" , labNumber);
    }
}
