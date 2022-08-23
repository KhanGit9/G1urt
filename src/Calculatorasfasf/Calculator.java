package Calculatorasfasf;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String numbers = scanner.nextLine();
            System.out.println(Main.calc(numbers));
        }
    }
}
