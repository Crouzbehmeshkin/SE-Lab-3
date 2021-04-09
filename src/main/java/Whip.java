public class Whip extends Decorator {
    public Whip(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with whip";
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
