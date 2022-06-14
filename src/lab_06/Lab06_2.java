package lab_06;

import java.util.Scanner;

public class Lab06_2 {

    public static void main(String[] args) {

//        String myPassword = "password123";
//        Allow user to input maximum 3 times

        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int times = 0;

        do {
            System.out.println("Input pass: ");
            String input = scanner.next();
            System.out.println("Pass is inputed: " + input);

            if (input.equals(myPassword)){
                System.out.println("Right password");
                break;
            }
            else {
                System.out.println("Wrong password");
                times++;
            }

        }
        while (times < 3);

    }
}
