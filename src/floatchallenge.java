import java.util.Scanner;
public class floatchallenge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your first double number");
        double a = sc.nextDouble();
        System.out.println("write your second double number ");
        double b = sc.nextDouble();
        double add = a + b;
        double sub = a - b;
        double multi = a * b;
        double divide = a / b;
        System.out.println("the Addtion of your number is " + add);
        System.out.println("the Subtration of your number is " + sub);
        System.out.println("the multiplication of your number is " + multi);
        System.out.println("the Divide of your number is " + divide);
        System.out.println("Hello Rahul ");

    }
}