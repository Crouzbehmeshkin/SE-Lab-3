public class PowerCalculator {
    private PowerImplementor power_implementor;

    public PowerCalculator(PowerImplementor power_implementor) {
        this.power_implementor = power_implementor;
    }

    public double calculate(double base, int power) {
        return this.power_implementor.operation(base, power);
    }
}