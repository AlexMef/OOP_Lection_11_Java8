public class WorkerHourly implements Worker {
    private String name;
    private int hoursCount;
    private double hourlyPayment;

    WorkerHourly(String name, int hoursCount, double hourlyPayment) {
        this.name = name;
        this.hoursCount = hoursCount;
        this.hourlyPayment = hourlyPayment;
    }

    public int getHoursCount() {
        return hoursCount;
    }

    public void setHoursCount(int hoursCount) {
        this.hoursCount = hoursCount;
    }

    public double getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPayment() {
        return 20.8 * 8 * hourlyPayment;
    }

    @Override
    public String toString() {
        return getName() + "  " + getPayment();
    }
}
