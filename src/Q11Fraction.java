public class Q11Fraction {
    private int e1;
    private int e2;
    private int d1;
    private int d2;

    public Q11Fraction(int e1, int e2, int d1, int d2) {
        this.e1 = e1;
        this.e2 = e2;
        this.d1 = d1;
        this.d2 = d2;
    }

    public String getSum() {
        int es = (e1 * d2) + (e2 * d1);
        int ds = (d1 * d2);
        return es + "/" + ds;
    }

    public String getProduct() {
        int ep = (e1 * e2);
        int dp = (d1 * d2);
        return ep + "/" + dp;
    }

    public static void main(String[] args) {
        Q11Fraction f1 = new Q11Fraction(1, 1, 2, 3);
        System.out.println(f1.getSum());
        System.out.println(f1.getProduct());
    }
}