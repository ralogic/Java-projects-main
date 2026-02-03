import java.util.Scanner;
public class LeastCommon {
    static void main(String[] args) {
        System.out.println("Welcome to Our Program");
        System.out.println("Enter the Digits for LCF");
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        System.out.println("LCM of the two numbers is " + LeastCommonDigit(Num1,Num2));
    }
    public static int LeastCommonDigit(int Num1, int Num2){
        int i = 1;
        while(i <= Num2){
            int factor = Num1 * i;
            if(factor % Num2 == 0){
                return factor;
            }
            i++;
        }
        return 0;//This is unreachable

    }
}