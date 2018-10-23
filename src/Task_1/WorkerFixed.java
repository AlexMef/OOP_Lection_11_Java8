package Task_1;

public class WorkerFixed implements Worker {
    private String name;
    private double fixedPayment;
    private double reward;

    WorkerFixed(String name, double fixedPayment, double reward){
        this.name = name;
        this.fixedPayment = fixedPayment;
        this.reward = reward;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
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
        return getName() + "  " + getPayment();
    }
}
