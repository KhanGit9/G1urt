
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
            char [] symbols = number.toCharArray();
            char symbol;
            if ((symbols[1]=='+')||(symbols[1]=='-')||(symbols[1]=='/')||(symbols[1]=='*')){
                symbol=symbols[1];
            } else if ((symbols[2]=='+')||(symbols[2]=='-')||(symbols[2]=='/')||(symbols[2]=='*')) {
                symbol=symbols[2];
            } else if ((symbols[3]=='+')||(symbols[3]=='-')||(symbols[3]=='/')||(symbols[3]=='*')) {
                symbol=symbols[3];
            } else {
                symbol='|';
            }
            String[] result = number.split("");
            int i = romenumbers.get(massiv[0]);
            int b = romenumbers.get(massiv[1]);
            if (i > 10) {
                return;
            }
            if (b > 10) {
                return;
            }
            if (Character.compare(symbol, '+')==0) {
                int resultat = i + b;
                String rome = inversekeys.get(resultat);
                System.out.println(rome);
            }
            if (Character.compare(symbol, '-')==0) {
                int resultat1 = i - b;
                String rome = inversekeys.get(resultat1);
                System.out.println(rome);
            }
            if (Character.compare(symbol, '*')==0) {
                int resultat2 = i * b;
                String rome = inversekeys.get(resultat2);
                System.out.println(rome);
            }
            if (Character.compare(symbol, '+')==0) {
                int resultat3 = i/b;
                String rome = inversekeys.get(resultat3);
                System.out.println(rome);
            }
        }
    }

