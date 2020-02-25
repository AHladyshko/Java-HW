package hw2;

public class Task2_3 {
    public static void main(String[] args){
        int money_Amount = 10000;
        int months = 7;
        int percentage_Per_Year = 12 ;
        float money_Res = money_Amount*((percentage_Per_Year*0.01f)/12);
        System.out.println("Got profit : " + money_Res*months);
    }
}
