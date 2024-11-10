package Builder;

abstract  public class StarbucksBuilder extends Starbucks {
    protected Starbucks starbucks;


    public void createStarbucks() {
        starbucks = new Starbucks();

    }

    public Starbucks getStarbucks() {
        return starbucks;
    }

    abstract public void buildSize() ;

   abstract  public void buildDrink();


}
