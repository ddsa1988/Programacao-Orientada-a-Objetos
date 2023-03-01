import java.util.HashMap;
import java.util.Scanner;

public class HashMapConcept {
    public static void main(String[] args){
        Scanner consoleRead = new Scanner(System.in);
        HashMap<String, Integer> person = new HashMap<String, Integer>();

        int dataSize = 0;
        int counter = person.size();

        while (true){
            System.out.println("How many names and ages would you like to get: ");
            String data = consoleRead.next();

            try {
                dataSize = Integer.parseInt(data);
                break;
            }catch (Exception error){
                System.out.println("Invalid number!");
            }
        }

        while (counter < dataSize){
            while (true){
                System.out.printf("Type the %dº name: ", counter + 1);
                String nameData = consoleRead.next();

                System.out.printf("Type the %dª age: ", counter + 1);
                String ageData = consoleRead.next();

                try {
                    int age = Integer.parseInt(ageData);

                    if(age < 0){
                        throw new Exception();
                    }

                    person.put(nameData, age);

                    counter++;
                    break;

                }catch (Exception error){
                    System.out.println("Invalid data! Try again!");
                }
            }
        }

        System.out.println();

        System.out.println(person);
        System.out.println(person.keySet());
        System.out.println(person.values());
    }
}
