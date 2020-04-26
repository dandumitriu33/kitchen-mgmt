package employee;

import ingredient.Ingredient;

public class Cook extends Employee {
    boolean receivedKnife;

    public Cook() {
        super();
        this.receivedKnife = false;
    }

    public void giveKnife() {
        this.receivedKnife = true;
    }

    public void cook(Ingredient ingredient) {
        //no action at this time
    }
}
