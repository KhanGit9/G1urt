package Calculatorasfasf;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String numbers = scanner.nextLine();
            String[] split = numbers.split("-|\\+|/|\\*");
           try {
                int i = Integer.parseInt(split[0]);
                int b = Integer.parseInt(split[1]);
                weryt.arabCalc(numbers);
            } catch (NumberFormatException e) {
                Rome.romeCalc(numbers);
            }
        }
    }
}
