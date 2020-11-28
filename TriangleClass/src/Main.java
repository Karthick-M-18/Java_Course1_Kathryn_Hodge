public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);
        double triA = triangleA.FindArea();
        System.out.println("The area of Triangle A is "+triA);
        double triB = triangleB.FindArea();
        System.out.println("The area of Triangle B is "+triB);
        System.out.println(triangleA.sideLenTwo);
        System.out.println(triangleB.base);
    }
}
