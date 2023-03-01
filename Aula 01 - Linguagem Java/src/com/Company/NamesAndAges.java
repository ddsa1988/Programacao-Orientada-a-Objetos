package com.Company;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class NamesAndAges {
    public static void main(String[] args){
        Scanner consoleRead = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();

        int dataSize = 0;
        int counter = names.size();

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

                    names.add(nameData);
                    ages.add(age);
                    counter++;
                    break;

                }catch (Exception error){
                    System.out.println("Invalid data! Try again!");
                }
            }
        }

        System.out.println();

        System.out.println("Normal order: ");
        System.out.println(names);
        System.out.println(ages);

        System.out.println();

        Collections.reverse(names);
        Collections.reverse(ages);
        System.out.println("Reverse Order: ");
        System.out.println(names);
        System.out.println(ages);
    }
}
