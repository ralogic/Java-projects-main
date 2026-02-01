import java.util.Scanner;
public class arithchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your first number");
        int FirstNumber = sc.nextInt();
        System.out.println("write your second number");
        int SecondNumber = sc.nextInt();
        int sum = FirstNumber + SecondNumber;
        int sub = FirstNumber - SecondNumber;
        int multi = FirstNumber * SecondNumber;
        int divide = FirstNumber / SecondNumber;
        System.out.println("your addition is " + sum );
        System.out.println("your subtration is " + sub);
        System.out.println("your multiplication is "+ multi);
        System.out.println("your divide of number is " + divide);


    }
}