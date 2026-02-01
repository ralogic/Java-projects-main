import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class factorialmain {
    static void main(String[] args) {
        System.out.println("Hello To our Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit for factorial");
        int num = sc.nextInt();
        long Result = RunCode(num);
        System.out.println(Result);

    }
    public static long RunCode(int n){
        long fact = 1;
        int i = 1;
        if(n < 2){
            return 1;
        }
        while(i < n){
            fact = n * fact;
            n--;
        }
        return fact;
    }
}