
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );
        System.out.println("Type a number:");
        int a = Integer.parseInt(reader.nextLine());
        int b = a%2;
        if(b != 0 ){
            System.out.println("Number "+ a +" is odd.");
        }else{
            System.out.println("Number "+a+" is even.");
        }

    }
}