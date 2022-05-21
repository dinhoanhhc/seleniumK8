package lab_02;

import java.util.Scanner;

public class Lab02_1 {

    public static void main(String[] args) {
        final double UNDER_WEIGHT = 18.5;
        final double NORMAL_WEIGHT = 25;
        final double OVER_WEIGHT = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight: ");
        float yourWeight = scanner.nextFloat();
        System.out.print("Please input your height: ");
        float yourHeight = scanner.nextFloat();

        float BMI = yourWeight / (yourHeight * yourHeight);
        System.out.println("Your BMI is " + BMI);

        if (BMI < UNDER_WEIGHT){
            System.out.println("Underweight");
        }
        else if (BMI >= UNDER_WEIGHT && BMI < NORMAL_WEIGHT){
            System.out.println("Normal weight");
        }
        else if (BMI >= NORMAL_WEIGHT && BMI < OVER_WEIGHT){
            System.out.println("Overweight");
        }
        else System.out.println("Obesity");


    }
}
