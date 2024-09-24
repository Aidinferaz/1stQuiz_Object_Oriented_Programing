public class Main {
    private int numerator;
    private int denominator;

    public Main(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Main getSum(Main f1, Main f2) {
        int newNumerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int newDenominator = f1.denominator * f2.denominator;
        return new Main(newNumerator, newDenominator);
    }

    public static Main getProduct(Main f1, Main f2) {
        int newNumerator = f1.numerator * f2.numerator;
        int newDenominator = f1.denominator * f2.denominator;
        return new Main(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Main f1 = new Main(1, 2);
        Main f2 = new Main(1, 3);

        Main sum = getSum(f1, f2);
        Main product = getProduct(f1, f2);

        System.out.println("Sum: " + sum);      // Output: Sum: 5/6
        System.out.println("Product: " + product); // Output: Product: 1/6
    }
}
