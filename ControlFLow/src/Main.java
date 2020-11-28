import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("Playing the current song");
            System.out.println("Do you want to Repeat");
            System.out.println("Y or N");
            String inp = scan.next();
            switch (inp){
                case "N":
                    repeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
