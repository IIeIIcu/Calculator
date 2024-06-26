package Calc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum RomanBOBA {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
    VIII(8), IX(9), X(10),
    XL(40), L(50), XC(90), C(100);

    public static ReadBOBA read;
    public int value;

    RomanBOBA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanBOBA> getReverseSortedValues() {
        return Arrays.stream(values()).sorted(Comparator.comparing((RomanBOBA e) -> e.value).reversed())
                .collect(Collectors.toList());


    }
}
