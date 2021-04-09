public class PowerImplementor2 extends PowerImplementor {
    public PowerImplementor2(MultImplementor mult_implementor) {
        super(mult_implementor);
    }

    public int operation(int base, int power) {
        if (power == 0)
            return 1;
        if (power%2 == 0)
        {
            int half = operation(base, power/2);
            return mult_implementor(half, half);
        }
        else
            return mult_implementor.operation(operation(base, power/2),
                    operation(base, power - power/2));
        return 0;
    }
}
