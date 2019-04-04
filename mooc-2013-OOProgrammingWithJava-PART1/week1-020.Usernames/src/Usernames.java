
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String[] usernames = {"alex", "emily"};
        String[] passwords = {"mightyducks", "cat"};
        
        System.out.println(java.util.Arrays.asList(usernames).indexOf("emily"));
        
        System.out.println("Type your username:");
        String foo = reader.nextLine();
        System.out.println("Type your password:");
        String bar = reader.nextLine();
        int userCheck = java.util.Arrays.asList(usernames).indexOf(foo);
        int pwordCheck = java.util.Arrays.asList(passwords).indexOf(bar);
        
        if(userCheck == pwordCheck && userCheck != -1){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }
}
