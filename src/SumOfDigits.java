import java.util.Scanner;
public class SumOfDigits {
    static void main(String[] args) {
        System.out.println("Welcome to Our Program ");
        System.out.println("Enter Your Digit for Sum Of Digits ");
        System.out.println("Your sum of Digit is " + SumDigits());
    }
    public static int SumDigits(){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int sum = 0;
        while(Num > 0){
            int digit = Num %10;
            sum  = sum + digit;
            Num = Num / 10;
        }
        return sum;
    }
}