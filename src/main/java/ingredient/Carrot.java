package ingredient;

public class Carrot implements Ingredient{
    String name = "carrot";

    public Carrot() {
        super();
        // no other properties at this time
    }

    @Override
    public String getName() {
        return this.name;
    }
}
