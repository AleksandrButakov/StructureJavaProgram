package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;
import static model.constants.Discount.DISCOUNT_ZERO;

public class Apple extends Food implements Discountable {

    // public double discount;

    public Apple(int amount, double price, String colour) {

        super(amount, price, true);
        this.colour = colour;

        if (colour.equals(RED)) {
            this.discount = DISCOUNT;
        } else {
            this.discount = DISCOUNT_ZERO;
        }

    }

    @Override
    public double getDiscount() {
        return discount;
    }

}