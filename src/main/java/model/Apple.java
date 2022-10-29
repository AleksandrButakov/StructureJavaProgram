package model;

import model.constants.Colour;

public class Apple extends Food {

    private String colour;

    /*
        public Meat(int amount, double price) {
        super(amount, price, false);
        }
     */

    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;

    }

}
