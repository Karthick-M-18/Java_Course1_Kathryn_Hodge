public class Main {
    public static double calculateTotalMealPrice(double listedMealPrice,double tipRate,double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        double a = calculateTotalMealPrice(15,.2,.08);
        System.out.println(a);
        a = calculateTotalMealPrice(12,.25,.01);
        System.out.println(a);
//        a = calculateTotalMealPrice(115,.5,.09);
//        System.out.println(a);
//        a = calculateTotalMealPrice(105,.42,.10);
//        System.out.println(a);
        double individual = calculateTotalMealPrice(12,.25,0.1)/5;
        System.out.println(individual);
    }
}
