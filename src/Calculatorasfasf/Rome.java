
package Calculatorasfasf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Rome {
    public static String romeCalc(String str) throws RuntimeException {
        Map<String, Integer> romenumbers = MapPAl.rome();
        Map<Integer, String> inversekeys = MapInvers.arab();
        String number = str.replaceAll("\\s+", "");
        String[] massiv = number.split("[-+/*]");
        char[] symbols = number.toCharArray();
        char symbol = 0;
        for (char x:symbols) {
            switch (x){
                case ('+'):
                    symbol=x;
                    break;
                case ('-'):
                    symbol=x;
                    break;
                case ('*'):
                    symbol=x;
                    break;
                case ('/'):
                    symbol=x;
                    break;
            }
        }
        int count = 0;
        for (char x:symbols) {
            switch (x) {
                case ('+') -> count++;
                case ('-') -> count++;
                case ('*') -> count++;
                case ('/') -> count++;
            }
        }
        if (count > 1) throw new RuntimeException("Больше одного оператора");
        int i = romenumbers.get(massiv[0]);
        int b = romenumbers.get(massiv[1]);
        if (i > 10 || i < 1) throw new RuntimeException("Вы вышли за пределы допустимых значений для ввода");
        if (b > 10 || b < 1) throw new RuntimeException("Вы вышли за пределы допустимых значений для ввода");
        if (symbol == '+') {
            int resultat = i + b;
            if (resultat <= 0) {
                throw new RuntimeException("Результат выражения меньше или равен нулю");
            } else {
                return inversekeys.get(resultat);
            }
        }
        if (symbol == '-') {
            int resultat1 = i - b;
            if (resultat1 <= 0) {
                throw new RuntimeException("Результат выражения меньше или равен нулю");
            } else {
                return inversekeys.get(resultat1);
            }
        }
        if (symbol == '*') {
            int resultat2 = i * b;
            if (resultat2 <= 0) {
                throw new RuntimeException("Результат выражения меньше или равен нулю");
            } else {
                 return inversekeys.get(resultat2);
            }
        }
        if (symbol == '/') {
            int resultat3 = i / b;
            if (resultat3 <= 0)  {
                throw new RuntimeException("Результат выражения меньше или равен нулю");
            } else {
                return inversekeys.get(resultat3);
            }
        }
        return "Введен не корректный символ";
    }
}
