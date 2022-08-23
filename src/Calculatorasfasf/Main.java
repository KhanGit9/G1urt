package Calculatorasfasf;
public class Main {
    public static String calc(String input) {
        String[] split = input.split("[-+/*]");
        try {
            int i = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            return Arab.arabCalc(input);
        } catch (NumberFormatException e) {
            return Rome.romeCalc(input);
        }
    }
}
