public class Main {
    public static void main(String[] args) {
        StudentProfile student1 = new StudentProfile("Karthick", "murugesan", 2020, 8.2, "Mechanical Engineering");
        StudentProfile student2 = new StudentProfile("Tyrion", "Lanister", 2020, 7.2, "I drink and i know things");
        System.out.println(student1.FirstName);
        System.out.println(student1.LastName);
        System.out.println(student1.ExpYear);
        System.out.println(student1.decMajor);
        System.out.println(student1.incrementYearOfGraduation());
        System.out.println(student2.FirstName);
        System.out.println(student2.LastName);
        System.out.println(student2.ExpYear);
        System.out.println(student2.incrementYearOfGraduation());
        System.out.println(student2.decMajor);
    }
}