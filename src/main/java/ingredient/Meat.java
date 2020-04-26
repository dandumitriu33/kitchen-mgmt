package ingredient;

public class Meat implements Ingredient{
    String name = "Meat";

    public Meat() {
        super();
        // no other properties at this time
    }

    @Override
    public String getName() {
        return this.name;
    }
}
