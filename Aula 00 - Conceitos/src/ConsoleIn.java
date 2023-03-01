import java.util.Scanner;

public class ConsoleIn {
    public static void main(String args[]){
        Scanner consoleRead = new Scanner(System.in);

        System.out.println("Type a string: ");
        String myString = consoleRead.next();
        System.out.println(myString);
        System.out.println(myString.getClass());
        System.out.println();

        while (true){
            System.out.println("Type a number: ");
            String input = consoleRead.next();
            try {
                float myNumber = Float.parseFloat(input);
                System.out.println(myNumber);
                break;
            }catch (Exception error){
                System.out.println("Invalid number!");
                System.out.println("Exception: " + error);
                System.out.println();
            }

        }
    }
}
