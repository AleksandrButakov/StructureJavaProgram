package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {

    public Apple(int amount, double price, String colour) {

        super(amount, price, true);
        this.colour = colour;

        if (colour.equals(RED)) {
            this.discount = DISCOUNT;
        } else {
            this.discount = 0;
        }

    }

}