import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dum = "Machine";
        System.out.println("Which is the largest planet in the solar system?");
        System.out.println("a ) Earth");
        System.out.println("b ) Neptune");
        System.out.println("C ) Jupiter");
        System.out.println("d ) Saturn");
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        if(inp.toLowerCase().equals("jupiter")){
            dum = "Correct_machine";
            System.out.println("Congrats! You are right");
        }
        else{
            dum = "Wrong_machine";
            System.out.println("Sorry! Wrong Answer");
        }
        System.out.println(dum);
    }
}
