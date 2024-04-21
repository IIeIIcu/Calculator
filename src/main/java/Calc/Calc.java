package Calc;

public class Calc {
    public static int Calculator(int oneNumber, int twoNumber, String operation) {
        int result;
        switch (operation) {
            case "+":
                result = oneNumber + twoNumber;
                break;
            case "-":
                result = oneNumber - twoNumber;
                break;
            case "*":
                result = oneNumber * twoNumber;
                break;
            case "/":
                result = oneNumber / twoNumber;
                break;
            default:
                throw new IllegalArgumentException("Не правильный ввод операции");
        }

        return result;

    }
}

class Main {

    public static void main(String[] args) {
        ReadBOBA reed = new ReadBOBA();

        Calc calс = new Calc();
        while (true) {
            reed.readA();

            if (reed.getOneNumber().equals("!")) {
                System.out.println("Калькулятор остановлен !");
                return;
            }


            if (reed.RomanAndArabic()) {
                int oneArabicNumber = ArabicinRoman.arabicinRoman(reed.getOneNumber());
                int twoArabicNumber = ArabicinRoman.arabicinRoman(reed.getTwoNumber());
                String operation = reed.getOperation();

                int result = calс.Calculator(oneArabicNumber, twoArabicNumber, operation);

                String resultInRoman = ArabicRoman2.arabicToRoman(result);
                System.out.println(resultInRoman);


            } else {
                int oneNum = Integer.parseInt(reed.getOneNumber());
                int twoNum = Integer.parseInt(reed.getTwoNumber());
                String operations = reed.getOperation();
                try {
                    if (oneNum < 1 || oneNum > 10 || twoNum < 1 || twoNum > 10) {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("вводите числа от 1 до 10");

                }


                int res = calс.Calculator(oneNum, twoNum, operations);
                System.out.println(res);
            }


        }
    }
}
