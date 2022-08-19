
package Calculatorasfasf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Rome {
    public static void romeCalc(String str) {
            Map<String, Integer> romenumbers = MapPAl.rome();
            Map<Integer, String> inversekeys = MapInvers.arab();
            String number = str.replaceAll("\\s+", "");
            String[] massiv = number.split("-|\\+|/|\\*");
            String[] result = number.split("");
            List<String> fromresult = Arrays.asList(result);
            int i = romenumbers.get(massiv[0]);
            int b = romenumbers.get(massiv[1]);
            if (i > 10)
                return;
            if (b > 10)
                return;
            if (fromresult.contains("+")) {
                int resultat = i + b;
                String rome = inversekeys.get(resultat);
                System.out.println(rome);
            }
            if (fromresult.contains("-")) {
                int resultat1 = i - b;
                String rome = inversekeys.get(resultat1);
                System.out.println(rome);
            }
            if (fromresult.contains("*")) {
                int resultat2 = i * b;
                String rome = inversekeys.get(resultat2);
                System.out.println(rome);
            }
            if (fromresult.contains("/")) {
                int resultat3 = i/b;
                String rome = inversekeys.get(resultat3);
                System.out.println(rome);
            }
        }
    }

