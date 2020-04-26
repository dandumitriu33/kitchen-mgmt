package ingredient;

public class IngredientFactory {

    public Ingredient createIngredient(String ingredientType) {
        if (ingredientType==null) {
            return null;
        }
        if (ingredientType.equalsIgnoreCase("CARROT")) {
            return new Carrot();
        }
        else if (ingredientType.equalsIgnoreCase("POTATO")) {
            return new Potato();
        }
        else if (ingredientType.equalsIgnoreCase("MEAT")) {
            return new Meat();
        }
        return null;
    }
}
