package Task_1;

public class WorkerHourly implements Worker {
    private int ID;
    private String name;
//    private int hoursCount;
    private double hourlyPayment;

    WorkerHourly(int ID, String name, double hourlyPayment) {
        this.ID = ID;
        this.name = name;
//        this.hoursCount = hoursCount;
        this.hourlyPayment = hourlyPayment;
    }

//    public int getHoursCount() {
//        return hoursCount;
//    }
//
//    public void setHoursCount(int hoursCount) {
//        this.hoursCount = hoursCount;
//    }

    double getHourlyPayment() {
        return hourlyPayment;
    }

    void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    int getID() {
        return ID;
    }

    void setID(int ID) {
        this.ID = ID;
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
        return getID() + "  " +  getName() + "  " + getPayment();
    }
}
