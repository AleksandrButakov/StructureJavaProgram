package service;

import model.Food;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;

public class ShoppingCart {

    Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    // task 1
    public double sumWithoutDiscount() {
        double sumWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].discount == 0) {
                sumWithoutDiscount += (foods[i].getPrice()) * (foods[i].getAmount());
            }
        }
        return sumWithoutDiscount;      // сумму покупки без скидки;
    }

    // task 2
    public double sumWithDiscount() {
        double sumWithDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].discount == DISCOUNT) {
                sumWithDiscount += (foods[i].getPrice()) * (foods[i].getAmount());
            }
        }
        return sumWithDiscount;     // сумму покупки без скидки;
    }

    // task 3
    public double sumVegetarianProductsWithoutDiscount() {
        double sumVegetarianProductsWithoutDiscount = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian() == true && foods[i].discount == 0) {
                sumVegetarianProductsWithoutDiscount += (foods[i].getPrice()) * (foods[i].getAmount());
            }
        }
        return sumVegetarianProductsWithoutDiscount;    // сумму покупки без скидки;
    }

}