public class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
