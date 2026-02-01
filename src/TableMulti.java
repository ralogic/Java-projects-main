import java.util.Scanner;
public class TableMulti {
    static void main(String[] args) {
        System.out.println("hello world");
        multiplication();
    }
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number for your table ");
        int Num = sc.nextInt();
        int Task = 1;
        while(Task <= 10){
            System.out.println((Num)+"*"+(Task)+"="+(Num*Task));
            Task++;
        }

    }
}


