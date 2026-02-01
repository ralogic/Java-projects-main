import java.util.Scanner;
public class posinegi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to number checker ");
        System.out.println("please enter your number");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("your number is positive");
        } else if (num == 0) {
            System.out.println("your number is zero");
        }else{
            System.out.println("your number is negative");
        }
    }
}