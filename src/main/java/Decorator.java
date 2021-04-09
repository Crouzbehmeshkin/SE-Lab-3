public abstract class Decorator implements Beverage{
    private Beverage _beverage;
    public Decorator(Beverage beverage) {
        this._beverage = beverage;
    }

    public String getDescription()
    {
        return this._beverage.getDescription();
    }

    @Override
    public double cost() {
        return this._beverage.cost();
    }
}
