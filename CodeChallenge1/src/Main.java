import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "What is the value of acceleration due to gravity in m/s^2";
        double c1 = 19.8;
        double c2 = 9.8;
        double c3 = 8.9;
        double c4 = 9.18;

        System.out.println(question);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        boolean ip = true;
        while(ip){
        System.out.println("Type your answer");
        Scanner scan = new Scanner(System.in);
        double ans = scan.nextDouble();
        if (ans == c2){
            System.out.println("Congrats you are right");
            ip = false;
        }
        else {
            System.out.println("Sorry, try again");
        }
        }
    }
}
