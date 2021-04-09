public abstract class PowerImplementor {
    protected MultImplementor mult_implementor;

    public PowerImplementor(MultImplementor mult_implementor) {
        this.mult_implementor = mult_implementor;
    }

    public int operation(int base, int power) {
        return 0;
    }
}
