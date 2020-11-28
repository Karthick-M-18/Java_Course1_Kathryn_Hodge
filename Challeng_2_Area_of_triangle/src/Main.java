import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double base = scan.nextDouble();
        while (base <= 0) {
            System.out.println("Base Cannot be 0 or less than 0");
            System.out.println("Enter the base of the triangle");
            base = scan.nextDouble();
        }
        System.out.println("Enter the height of the triangle");
        double height = scan.nextDouble();
        while (height <= 0) {
            System.out.println("Height Cannot be 0 or less than 0");
            System.out.println("Enter the height of the triangle");
            height = scan.nextDouble();
        }
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }
//        double height = scan.nextDouble();
//
//        if((base != 0)&&(height != 0)){
//            double area = (base * height)/2;
//            System.out.println("The area of the triangle is " + area);
//        }
//        else{
//            System.out.println("Neither base nor height should be less than 0");
//        }
    }
