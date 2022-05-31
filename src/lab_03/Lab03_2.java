package lab_03;

public class Lab03_2 {

    public static void main(String[] args) {
        int[] myNum = {24,4,3,2,7,14,22,9,12,1};
        int max = myNum[0];
        int min = myNum[0];
        System.out.println("Array is: ");

        for (int a = 0; a < myNum.length; a++) {
            System.out.print(" " + myNum[a]);

        }

        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] > max){
                max = myNum[i];
            }
        }

        for (int j = 0; j < myNum.length; j++) {
            if (myNum[j] < min){
                min = myNum[j];
            }

        }

        System.out.println();
        System.out.println("max is " + max);
        System.out.println("min is " + min);


    }
}
