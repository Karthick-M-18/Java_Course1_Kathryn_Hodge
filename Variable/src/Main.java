import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 21;
        double studentCGPA = 8.2;
        String student_name = "M.Karthick";
        char student_initial = student_name.charAt(0);
        String father_name = "Murugesan";
        boolean hundredpercentattendance = true;

        System.out.println(studentAge);
        System.out.println(studentCGPA);
        System.out.println(student_initial);
        System.out.println(student_name);
        System.out.println(hundredpercentattendance);
        System.out.println(student_name +" "+ father_name + " has a GPA of "+ studentCGPA);
        System.out.println("What is the updated GPA?");
        Scanner input = new Scanner(System.in);
        studentCGPA = input.nextDouble();
        System.out.println(student_name +" "+ father_name + " has a Updated GPA of "+ studentCGPA);

    }
}
