public class PowerCalculator {
    private PowerImplementor power_implementor;

    public PowerCalculator(PowerImplementor power_implementor) {
        this.power_implementor = power_implementor;
    }

    public int calculate(int base, int power) {
        return this.power_implementor.operation(base, power);
    }
}