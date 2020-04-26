package employee;

import ingredient.Ingredient;

public class kitchenHelper extends Employee {
    int carrotQuantity;
    int potatoQuantity;
    int meatQuantity;

    public kitchenHelper() {
        super();
        this.carrotQuantity = 0;
        this.potatoQuantity = 0;
        this.meatQuantity = 0;
    }

    public void yell() {
        System.out.println("We're all out!");
    }

    public void setIngredient(Ingredient ingredient, int quantity) {
        if (ingredient.getName().equalsIgnoreCase("CARROT")) {
            carrotQuantity = quantity;
        }
        else if (ingredient.getName().equalsIgnoreCase("POTATO")) {
            potatoQuantity = quantity;
        }
        else if (ingredient.getName().equalsIgnoreCase("CARROT")) {
            meatQuantity = quantity;
        }
    }

    /**
     * Method used to determine if the ingredient exists or the restaurant is all out.
     * @param ingredient
     * @return number of ingredient held by this kitchenHelper
     */
    public int getIngredientQuantity(Ingredient ingredient) {
        if (ingredient.getName().equalsIgnoreCase("CARROT")) {
            return carrotQuantity;
        }
        else if (ingredient.getName().equalsIgnoreCase("POTATO")) {
            return potatoQuantity;
        }
        else if (ingredient.getName().equalsIgnoreCase("CARROT")) {
            return meatQuantity;
        }
    }

    /**
     * Method used when the Chef is asking for ingredients. For now assuming the Chef
     * only asks for quantity 1 as no other details are provided.
     * @param ingredient
     */
    public void giveIngredient(Ingredient ingredient) {
        if (ingredient.getName().equalsIgnoreCase("CARROT") && carrotQuantity > 0) {
            carrotQuantity -= 1;
        }
        else if (ingredient.getName().equalsIgnoreCase("POTATO") && potatoQuantity > 0) {
            potatoQuantity -= 1;
        }
        else if (ingredient.getName().equalsIgnoreCase("CARROT") && meatQuantity > 0) {
            meatQuantity -= 1;
        }
    }

}
