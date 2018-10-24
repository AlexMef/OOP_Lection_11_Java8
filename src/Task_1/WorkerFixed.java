package Task_1;

public class WorkerFixed implements Worker {
    private int ID;
    private String name;
    private double fixedPayment;
    private double reward;

    WorkerFixed(int ID, String name, double fixedPayment, double reward){
        this.ID = ID;
        this.name = name;
        this.fixedPayment = fixedPayment;
        this.reward = reward;
    }

    double getFixedPayment() {
        return fixedPayment;
    }

    void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    double getReward() {
        return reward;
    }

    void setReward(double reward) {
        this.reward = reward;
    }

    int getID() {
        return ID;
    }

    void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPayment() {
        return fixedPayment + reward;
    }

    @Override
    public String toString() {
        return getID() + "  " + getName() + "  " + getPayment();
    }
}
