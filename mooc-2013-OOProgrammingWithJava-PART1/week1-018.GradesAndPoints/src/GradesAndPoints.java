
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int foo =  Integer.parseInt(reader.nextLine());
        if(foo<30){
            System.out.println("Grade: failed");
        }else if(foo<35){
            System.out.println("Grade: 1");
        }else if(foo<40){
            System.out.println("Grade: 2");
        }else if(foo<45){
            System.out.println("Grade: 3");
        }else if(foo < 50){
            System.out.println("Grade: 4");
        }else{
            System.out.println("Grade: 5");
        }
    }
}
