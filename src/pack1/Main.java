package pack1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int NUM_OF_MONTHS = 12;
        double[] monthlySales = new double[NUM_OF_MONTHS];
        double[] monthlySales2 = {1590.75, 7890.15, 6090.15};
        monthlySales[0] = 1590.75;
        monthlySales[1] = 7890.15;
        for (double each : monthlySales) {
            if (each != 0) {
                System.out.println(each);
            }
        }
        System.out.print("\n\n");
        for (double each : monthlySales2) {
            System.out.println(each);
        }
    }
}
