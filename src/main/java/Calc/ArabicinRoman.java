package Calc;

import java.util.List;

public class ArabicinRoman {
    public static int arabicinRoman(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanBOBA> romanNumerals = RomanBOBA.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanBOBA symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + "Это нельзя перевести в римскую цифру!");
        }

        return result;
    }
}
