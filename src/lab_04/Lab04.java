package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {
        getMenu();
        List<Integer> arrList = createArrayList();

//        List<Integer> myList = new ArrayList<>();
        boolean isContinue = true;

        while (isContinue == true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a number: ");
            int userIput = scanner.nextInt();
            switch (userIput) {
                case 1:
                    System.out.println("Print all numbers");
                    printAll(arrList);
                    break;
                case 2:
                    System.out.println("Print maximum value");
                    printMaxvalue(arrList);
                    break;
                case 3:
                    System.out.println("Print minimum value");
                    printMinvalue(arrList);
                    break;
                case 4:
                    searchNumber(arrList);
                    break;
                case 5:
                    System.out.println("Exit!");
                    isContinue = false;
                default:
                    System.out.println("Please input again");
            }


        }

    }


    public static void getMenu() {
        System.out.println("Menu");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    public static  List<Integer> createArrayList(){
        List<Integer> myArr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length: ");
        int arrLength = scanner.nextInt();

        for (int index = 0; index < arrLength; index++) {
            int random = new SecureRandom().nextInt(1000);
            myArr.add(random);
        }
        return myArr;
    }

    public static void printAll(List<Integer>myArr) {
        for (int number : myArr){
            System.out.println(number);
        }
    }

    public static void printMaxvalue(List<Integer>myArr) {
        int max = myArr.get(0);
        for (int number : myArr) {
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);
    }

    private static void printMinvalue(List<Integer> myArr) {
        int min = myArr.get(0);
        for (int number : myArr){
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }

    private static void searchNumber(List<Integer> myArr) {
        System.out.println("Search number: ");
        Scanner scanner = new Scanner(System.in);
        int numberSearch = scanner.nextInt();
        boolean isExist = false;
        for (int index = 0; index < myArr.size(); index++) {
            if (numberSearch == myArr.get(index)){
                System.out.println(numberSearch + " is in the " + index + " position");
            }
        }
    }



}
