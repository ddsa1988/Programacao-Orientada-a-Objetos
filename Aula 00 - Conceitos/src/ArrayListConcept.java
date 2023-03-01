import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept {
    public static void main(String[] args){
        Scanner consoleRead = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int listSize = 0;

        while (true){
            System.out.println("How many names would like to type: ");
            String answer = consoleRead.next();

            try {
               listSize = Integer.parseInt(answer);
               break;
            }catch (Exception error){
                System.out.println("Invalid number!");
            }
        }

        for (int i = 0; i < listSize; i++) {
            System.out.printf("Type the %d name: ", i + 1);
            String name = consoleRead.next();
            names.add(name);
        }
        System.out.println();
        System.out.println(names);
    }
}
