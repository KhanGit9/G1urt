

package Calculatorasfasf;

import java.util.Arrays;
import java.util.List;

public class weryt {
     static String number;

     public static void arabCalc(String str) {
         number = str.replaceAll("\\s+", "");
         String[] massiv = number.split("-|\\+|/|\\*");
         if (massiv.length>2) {
             return;
         }
         String[] result = number.split("");
         int i = Integer.parseInt(massiv[0]);
         int b = Integer.parseInt(massiv[1]);
         char [] symbols = number.toCharArray();
         char symbol;
         if (i==10) {
             symbol = symbols[2];
         } else {
             symbol = symbols[1];
         }
         if (i > 10)
             return;
         if (b > 10)
             return;
         if (Character.compare(symbol, '+')==0) {
             System.out.println(i+b);
         }
         if (Character.compare(symbol, '-')==0) {
             System.out.println(i-b);
         }
         if (Character.compare(symbol, '*')==0) {
             System.out.println(i*b);
         }
         if (Character.compare(symbol, '/')==0) {
             System.out.println(i/b);
         }
     }
 }

