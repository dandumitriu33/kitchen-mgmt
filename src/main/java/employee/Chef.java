package employee;

import ingredient.Ingredient;

public class Chef extends Employee {
    boolean receivedKnife;

    public Chef() {
        super();
        this.receivedKnife = false;
    }

    public void giveKnife() {
        this.receivedKnife = true;
    }

    public void yell() {
        // no action at this time
    }

    public void cook(Ingredient ingredient) {
        //no action at this time
    }

}
