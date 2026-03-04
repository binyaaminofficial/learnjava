import java.util.Scanner;

public class productinputs {
    public static void main(String[] args) {
       try (Scanner in = new Scanner (System.in)) {
        System.out.println("Enter First Number My Friend");
        int a = in.nextInt();
        System.out.println("Enter Second Number My Dost");
        int b = in.nextInt();
        int c = a*b;
        System.out.println("Answers of Product My Aziz is :"+ c);
       }
    }
}
