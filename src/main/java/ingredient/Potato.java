package ingredient;

public class Potato implements Ingredient{
    String name = "Potato";

    public Potato() {
        super();
        // no other properties at this time
    }

    @Override
    public String getName() {
        return this.name;
    }
}
