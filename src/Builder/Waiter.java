package Builder;

public class Waiter {

    private StarbucksBuilder sb;

    public void setStarBucksBuilder(StarbucksBuilder sb) {
        this.sb = sb;
    }

    public Starbucks getStarBucksDrink() {
        return this.sb.getStarbucks();
    }

    public void constructStarbucks() {
        this.sb.createStarbucks();
        this.sb.buildDrink();
        this.sb.buildSize();
    }

}
