

package Calculatorasfasf;

import java.util.Arrays;
import java.util.List;

public class Arab {
     static String number;

     public static String arabCalc(String str) throws RuntimeException {
         number = str.replaceAll("\\s+", "");
         String [] massiv = number.split("[-+/*]");
         int i = Integer.parseInt(massiv[0]);
         int b = Integer.parseInt(massiv[1]);
         char [] symbols = number.toCharArray();
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
         char symbol;
         if (i==10) {
             symbol = symbols[2];
         } else {
             symbol = symbols[1];
         }
         if (i > 10|| i<1) throw new RuntimeException("Вы вышли за пределы допустимых значений для ввода");
         if (b > 10|| b<1) throw new RuntimeException("Вы вышли за пределы допустимых значений для ввода");
         if (symbol == '+') {
             return String.valueOf((i+b));
         }
         if (symbol == '-') {
             return String.valueOf((i-b));
         }
         if (symbol == '*') {
             return String.valueOf((i*b));
         }
         if (symbol == '/') {
             return String.valueOf((i / b));

         }
         return "Введен не корректный символ";
     }
 }

