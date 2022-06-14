package lab_06;

import java.util.Arrays;

public class Lab06_3 {

    public static void main(String[] args) {
        String myStr = "12345nabc678";
        System.out.println("My String is: " + myStr);
        String number = "";
        char[] myChar = myStr.toCharArray();
        for (char isNumber : myChar) {
            if (Character.isDigit(isNumber)) {
                number = number.concat(String.valueOf(isNumber));
            }
        }
        System.out.println("Number is: " + number);
    }
}
