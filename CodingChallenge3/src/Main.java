import java.util.Scanner;

public class Main {
    public static double salary(double week_hour , double hour_sal, double vac_days){
        double tr = vac_days * 8;
        double sal = (week_hour - vac_days) * hour_sal;
        return  sal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No oh work hours");
        double whr = scan.nextDouble();
        System.out.println("Enter the salary per hour");
        double sal = scan.nextDouble();
        System.out.println("No of vacation daya");
        double vac = scan.nextDouble();
        double final_sal = salary(whr,sal,vac);
        System.out.println("The final salary is "+final_sal);
    }
}
