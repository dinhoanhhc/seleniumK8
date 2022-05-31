package lab_03;

public class Lab03_1 {

    public static void main(String[] args) {
        int arrLength = 5;
        int[] intArr = new int[arrLength];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arrLength; i++) {
            intArr[i] = i + 1;
            System.out.println(intArr[i]);
        }

        for (int j = 0; j < arrLength; j++) {
            if (intArr[j] % 2 == 0){
                countEven++;
            }
            else countOdd++;

        }

        System.out.println("Array has " + countEven + " Even numbers" );
        System.out.println("Array has " + countOdd + " Odd numbers" );

    }
}
