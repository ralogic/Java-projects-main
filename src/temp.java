import java.util.Scanner;
public class temp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you want to calculate ");
        System.out.println("For Centigrade to fehreneit type a");
        System.out.println("For fehreneit to centigrade type b");
        char typeOfTemp = sc.next().charAt(0);
        System.out.println("give me the value which you want to convert ");
        int theValue = sc.nextInt();
        if (typeOfTemp == 'a'){
            int theTemp = (theValue  * 9/5) + 32;
            System.out.println("the fehreneit is " + theTemp);
        }else {
            int theTemp = (theValue - 32) * 5/9;
            System.out.println("the centigrade is " + theTemp);
        }



    }
}