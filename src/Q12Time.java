public class Q12Time {
    private double hour;
    private double minute;

    public Q12Time(double hour, double minute) {
        this.hour = hour % 12;
        this.minute = minute;
    }

    public static double timeAngle(Q12Time time) {
        double minDegree = 6 * time.minute;
        double hourDegree = (30 * time.hour) + (0.5 * time.minute);
        double totalDegree = Math.abs(minDegree - hourDegree);
        return Math.min(totalDegree, 360 - totalDegree);
    }

    public static void main(String[] args) {
        Q12Time time = new Q12Time(3, 10);
        System.out.println(timeAngle(time));
    }
}
