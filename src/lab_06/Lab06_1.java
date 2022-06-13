package lab_06;

import java.util.Arrays;

public class Lab06_1 {

    public static void main(String[] args) {
        //Given input string: "2hrs and 5 minutes"
        //Please calculate how many minutes in total

        String text = "2hrs and 5 minutes";
        System.out.println(text);
        String[] spilitStr = text.split("and");
        //System.out.println(Arrays.toString(spilitStr));
        int hrs = Integer.parseInt(spilitStr[0].replaceAll("[^0-9]",""));
        int minutes = Integer.parseInt(spilitStr[1].replaceAll("[^0-9]",""));
        int totalMinutes = hrs * 60 + minutes;
        System.out.println("Hourse: " + hrs + "h");
        System.out.println("Minutes: " + minutes + "m");
        System.out.println("Total minutes: " + totalMinutes + "m");

    }
}
