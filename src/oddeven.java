import java.util.Scanner;
public class oddeven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd even checker");
        System.out.println("Enter your Number !");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println("your number is even");
        else System.out.println("your number is odd");
    }
}