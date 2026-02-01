import java.util.Scanner;
public class OddSum {
    static void main(String[] args) {
        System.out.println("Welcome to our program of odd Summer ");
        OddSummer();
    }
    public static void OddSummer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you highest number for odd sum ");
        int Num = sc.nextInt();
        int solution = (Num + 1) / 2;
        System.out.println("Your answer is :- "+ (solution * solution));

    }
}