public class Q15Weight {
    private double weight;

    public Q15Weight(double weight) {
        this.weight = weight;
    }

    public double getPound() {
        return weight;
    }

    public double getKilo() {
        return weight * 0.45359237;
    }
}
