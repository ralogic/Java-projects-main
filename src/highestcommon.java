import java.util.Scanner;
public class highestcommon {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our Program");
        System.out.println("Enter your first digit for highest common divisior");
        int first = sc.nextInt();
        System.out.println("Enter your Second digit for hgihest common divisior");
        int second = sc.nextInt();
        int FinalResult = HCF(first,second);
        System.out.println("Your Highest Common "+ FinalResult);
    }
    public static int HCF(int first, int second){
        int least = least(first,second);
        int gcd = 1;
        int i = 2;
        while(i <= least){
            if(first % i ==0 && second % i ==0){
                gcd = i;
            }
            i++;
        }
       return gcd;
    }
    public static int least(int first, int second){
        if(first < second) return first;
            else return second;

    }
}