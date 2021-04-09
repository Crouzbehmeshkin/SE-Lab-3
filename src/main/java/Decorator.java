public abstract class Decorator implements Beverage {
    private Beverage _beverage;

    public Decorator(Beverage beverage) {
        this._beverage = beverage;
    }

    public Beverage get_beverage() {
        return _beverage;
    }

    public String getDescription() {
        return get_beverage().getDescription();
    }

    @Override
    public double cost() {
        return get_beverage().cost();
    }
}
