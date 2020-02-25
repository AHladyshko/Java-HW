package hw2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter kilograms : ");
        float funt_weight ;
        funt_weight = scan.nextFloat();
        float kilo_Weight = (funt_weight * 0.4536F);
        System.out.println("Got weight: " + (int)kilo_Weight +" kilograms " +( kilo_Weight - (int)kilo_Weight )*1000+ " grams");
    }
}
