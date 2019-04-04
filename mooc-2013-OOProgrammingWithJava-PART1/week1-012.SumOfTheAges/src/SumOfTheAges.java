
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name:");
        String a = reader.nextLine();
        System.out.print("Type your age:");
        int b = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name:");
        String c = reader.nextLine();
        System.out.print("Type your age:");
        int d = Integer.parseInt(reader.nextLine());
        int result = b+d;
        System.out.println(a + " and " + c + " are "+ result+ " years old in total.");
    }
}
