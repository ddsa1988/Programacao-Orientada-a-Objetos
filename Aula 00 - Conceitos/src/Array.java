import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner consoleRead = new Scanner(System.in);
        int[] myNumbers = new int[5];
        int counter = 0;

        while(counter < myNumbers.length){
            System.out.format("Type the %dª integer number: ", counter + 1);
            String input = consoleRead.next();

            try{
                int number = Integer.parseInt(input);
                myNumbers[counter] = number;
                counter++;
            }catch (Exception error) {
                System.out.println("Invalid number. Try again!");
            }
        }
        System.out.println();
        System.out.print("Array: ");

        for (int number: myNumbers) {
            System.out.print(number + " ");
        }
    }
}
