package lab_02;

import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args) {

        float UNDER_WEIGHT = 18.5f;
        float NORMAL_WEIGHT = 25;
        float OVER_WEIGHT = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight(kg): ");
        float yourWeight = scanner.nextFloat();
        System.out.print("Please input your height(m): ");
        float yourHeight = scanner.nextFloat();

        float BMI = yourWeight / (yourHeight * yourHeight);
        System.out.println("Your BMI is " + BMI);

        float decrease;

        if (BMI < UNDER_WEIGHT) {
            System.out.println("Underweight");
            decrease = Math.abs(yourHeight * yourHeight * UNDER_WEIGHT - yourWeight);
            System.out.println("You should increase " + decrease + " kg");
        }
        else if (BMI >= UNDER_WEIGHT && BMI < NORMAL_WEIGHT) {
            System.out.println("Normal weight");
        }
        else if (BMI >= NORMAL_WEIGHT && BMI < OVER_WEIGHT) {
            System.out.println("Overweight");
            decrease = Math.abs(yourHeight * yourHeight * NORMAL_WEIGHT - yourWeight);
            System.out.println("You should decrease " + decrease + " kg");
        }
        else {
            System.out.println("Obesity");
            decrease = Math.abs(yourHeight * yourHeight * NORMAL_WEIGHT - yourWeight);
            System.out.println("You should decrease " + decrease + " kg");
        }

    }
}
