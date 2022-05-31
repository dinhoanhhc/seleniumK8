package lab_03;

public class Lab03_3 {

    public static void main(String[] args) {
        int[] myArray = {24,4,3,2,7,14,22,9,12,1};

        System.out.println("Array is: ");

        for (int a = 0; a < myArray.length; a++) {
            System.out.print(" " + myArray[a]);
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] > myArray[i]){
                    int var = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = var;
                }
            }
        }

        System.out.println();
        System.out.println("Sort: ");

        for (int b = 0; b < myArray.length; b++) {
            System.out.print(" " + myArray[b]);
        }

    }
}
