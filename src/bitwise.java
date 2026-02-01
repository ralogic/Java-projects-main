import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your number to check odd or even");
        int number = sc.nextInt();
//        int number = 7;

        if ((number & 1) == 1) {
            System.out.println("Number is ODD");
        } else {
            System.out.println("Number is EVEN");
        }
    }
}
