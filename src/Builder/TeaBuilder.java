package Builder;

public class TeaBuilder extends StarbucksBuilder {

    @Override()
    public void buildSize() {
        starbucks.setSize("M");
    }

    @Override()
    public void buildDrink() {
        starbucks.setDrink("Tea");
    }
}
