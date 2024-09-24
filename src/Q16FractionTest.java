public class Q16FractionTest {
    public static void main(String[] args) {
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(1, 3);

        Q16Fraction sum = Q16Fraction.sumFraction(f1, f2);
        Q16Fraction mul = Q16Fraction.mulFraction(f1, f2);

        System.out.println("Penjumlahan: " + sum);
        System.out.println("Perkalian: " + mul);
    }
}
