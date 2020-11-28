import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner inp = new Scanner(System.in);
        inp.next();
        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceDeveloperTeaTime();
        System.out.println("Develop code");
        System.out.println("Debug code");
        announceDeveloperTeaTime();
        System.out.println("Got promoted");
    }
}
