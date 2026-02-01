import java.util.Scanner;
public class swapNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the first you want to swap");
        int a = sc.nextInt();
        System.out.println("give me the second you want to swap");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        System.out.println(a);
        b = c;
        System.out.println(b);
        System.out.println("Hello rahul saini");
    }
}