public class Soy extends Decorator {
    public Soy(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with soy";
    }

    @Override
    public double cost() {
        return super.cost() + 0.15;
    }
}
