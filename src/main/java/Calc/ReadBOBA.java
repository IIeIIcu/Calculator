package Calc;

import java.util.Scanner;

public class ReadBOBA {
    private String[] array;
    private String oneNumber;
    private String twoNumber;
    private String operation;

    public void readA() {
        Scanner sc = new Scanner(System.in);


        array = sc.nextLine().toUpperCase().toUpperCase().split(" ");
    }


    public boolean RomanAndArabic() {
        boolean oneNumber = true;
        try {
            RomanBOBA.valueOf(getOneNumber());
        } catch (IllegalArgumentException e) {
            oneNumber = false;
        }
        boolean twoNumber = true;
        try {
            RomanBOBA.valueOf(getTwoNumber());
        } catch (IllegalArgumentException e) {
            twoNumber = false;
        }

        return (oneNumber && twoNumber);
    }

    public String getOneNumber() {
        this.oneNumber = array[0];
        return oneNumber;
    }

    public String getOperation() {
        this.operation = array[1];
        return operation;
    }

    public String getTwoNumber() {
        this.twoNumber = array[2];
        return twoNumber;
    }
}
