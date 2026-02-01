import java.util.Scanner;
public class factorial {
    static void main(String[] args) {
        System.out.println("Welcome to factorial calculator Program");

        System.out.println(bringNumber());
    }
    public static int bringNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit for Factorial Calculation");
        int Num = sc.nextInt();
        int number = 1;
        while(Num > 1){
            number = number * Num;
            Num--;
        }

        return number;
    }
}