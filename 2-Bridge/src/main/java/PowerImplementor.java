public abstract class PowerImplementor {
    private MultImplementor mult_implementor;

    public PowerImplementor(MultImplementor mult_implementor) {
        this.mult_implementor = mult_implementor;
    }

    public double operation(double base, int power) {
        return 0;
    }
}
