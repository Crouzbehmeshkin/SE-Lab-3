public class PowerImplementor1 extends PowerImplementor {
    public PowerImplementor1(MultImplementor mult_implementor) {
        super(mult_implementor);
    }

    public int operation(int base, int power) {
        int ret = 1;
        for (int i = 0; i < power; i++)
        {
            ret = mult_implementor.operation(ret, base);
        }
        return ret;
    }
}
