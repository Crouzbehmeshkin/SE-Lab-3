public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
