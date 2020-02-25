package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount numbers of array: ");
        int amount_of_elem = scanner.nextInt();


        int[] arr = new int[amount_of_elem];
        int[] positive_arr = new int[amount_of_elem];
        int[] negative_arr = new int[amount_of_elem];



        int num_pos_elem = 0;
        int num_neg_elem = 0;

        for (int i = 0 ; i < amount_of_elem; i++){
            arr[i] = (int)(Math.random()*50 - 25);
            if (arr[i] > 0) {
               positive_arr[num_pos_elem] = arr[i];
               num_pos_elem++;
            } else {
                negative_arr[num_neg_elem] = arr[i];
                num_neg_elem++;
            }
        }

        positive_arr = Arrays.copyOf(positive_arr, num_pos_elem);
        negative_arr = Arrays.copyOf(negative_arr, num_neg_elem);

        System.out.print("Starting array: ");
        printArray(arr);
        System.out.println();

        System.out.print("Posistive numbers: ");
        printArray(positive_arr);
        System.out.println();

        System.out.print("Negative numbers: ");
        printArray(negative_arr);


    }

    public static void printArray(int[] arr){
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
    }
}
