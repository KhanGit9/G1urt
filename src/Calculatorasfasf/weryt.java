

package Calculatorasfasf;

import java.util.Arrays;
import java.util.List;

public class weryt {
     static String number;

     public static void arabCalc(String str) {
         number = str.replaceAll("\\s+", "");
         String[] massiv = number.split("-|\\+|/|\\*");
         String[] result = number.split("");
         int i = Integer.parseInt(massiv[0]);
         int b = Integer.parseInt(massiv[1]);
         List<String> fromresult = Arrays.asList(result);
         if (i > 10)
             return;
         if (b > 10)
             return;
         if (fromresult.contains("+")) {
             System.out.println(i+b);
         }
         if (fromresult.contains("-")) {
             System.out.println(i-b);
         }
         if (fromresult.contains("*")) {
             System.out.println(i*b);
         }
         if (fromresult.contains("/")) {
             System.out.println(i/b);
         }
     }
 }

