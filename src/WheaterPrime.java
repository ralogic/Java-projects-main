//import java.util.Scanner;
//public class WheaterPrime {
//    static void main(String[] args) {
//        System.out.println("Welcome to Our program");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("tell us your digit to check is Prime");
//        int Prime = sc.nextInt();
//        int Result = isPrime(Prime);
//        if(Result == 1){
//            System.out.println("This is an prime number");
//        }else{
//            System.out.println("this is not a prime number");
//        }
//
//    }
//    public static int isPrime(int Prime){
//        int Isprimes = 1;
//        int i = 2;
//        while(Prime <= i){
//            if(Prime % i == 0){
//                Isprimes += 1;
//            }
//            i++;
//        }
//        if(Isprimes == 1){
//            return 1;
//        }
//    }
//}