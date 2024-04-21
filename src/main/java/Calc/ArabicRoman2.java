package Calc;

import java.util.List;

public class ArabicRoman2 {
    public static String arabicToRoman(int number) {
    if ((number <= 0) || (number > 100)) {
        throw new IllegalArgumentException("В римской системе отрицательных чисел нет !");
    }

    List<RomanBOBA> romanNumerals = RomanBOBA.getReverseSortedValues();

    int i = 0;
    StringBuilder sb = new StringBuilder();

    while ((number > 0) && (i < romanNumerals.size())) {
        RomanBOBA currentSymbol = romanNumerals.get(i);
        if (currentSymbol.getValue() <= number) {
            sb.append(currentSymbol.name());
            number -= currentSymbol.getValue();
        } else {
            i++;
        }
    }

    return sb.toString();
}
}
