package hw5;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int amount_of_elem = scanner.nextInt();


        int[] first_arr = new int [amount_of_elem];
        int[] second_arr = new int [amount_of_elem];
        int[] result = new int [amount_of_elem];

        for (int i = 0; i < result.length; i++){
            first_arr[i] =(int) (Math.random()  * 30);
            second_arr[i] =(int) (Math.random()  * 30);
        }



        System.out.print("First array: ");
        printArray(first_arr);

        System.out.println();

        System.out.print("Second array: ");
        printArray(second_arr);

        System.out.println();

        System.out.print("Result: ");

        for(int i = 0; i < result.length; i++){
            result[i] = first_arr[i] + second_arr[i];
        }

        printArray(result);
    }

    public static void printArray(int[] arr){
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
    }
}
