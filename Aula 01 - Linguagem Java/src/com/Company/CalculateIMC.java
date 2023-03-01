package com.Company;

import java.util.Scanner;

public class CalculateIMC {
    public static void main(String[] args){
        Scanner consoleRead = new Scanner(System.in);
        float weight = 0f;
        float height = 0f;

        while (true){
            System.out.println("Type your weight: ");
            String data = consoleRead.next();

            try {
                weight = Float.parseFloat(data);
                break;
            }catch (Exception error) {
                System.out.println("Invalid weight!");
            }
        }

        while (true){
            System.out.println("Type your height: ");
            String data = consoleRead.next();

            try {
                height = Float.parseFloat(data);
                break;
            }catch (Exception error) {
                System.out.println("Invalid height!");
            }
        }

        float imc = (float)(weight / Math.pow(height, 2f));
        System.out.printf("Your IMC is %.2f.", imc);
    }
}