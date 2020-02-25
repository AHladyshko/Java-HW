package hw2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your personal number: ");
        int num = scan.nextInt();

        int reverseNum = num % 100 % 10 * 100   +   num % 100 - num % 100 % 10   +   num/100;
        System.out.println( "Reverse number = " + reverseNum);
        System.out.println("Difference inverse to the personal number = " + (reverseNum - num));
    }
}
