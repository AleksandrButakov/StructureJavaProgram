package service;

import model.Food;

import static model.constants.Discount.DISCOUNT;
import static model.constants.Discount.DISCOUNT_ZERO;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    // task 1
    public double sumWithoutDiscount() {
        double sumWithoutDiscount = 0;

        for (Food food: foods) {
            if (food.discount == DISCOUNT_ZERO) {
                sumWithoutDiscount += (food.getPrice()) * (food.getAmount());
            }
        }
        return sumWithoutDiscount;      // сумму покупки без скидки;
    }

    // task 2
    public double sumWithDiscount() {
        double sumWithDiscount = 0;

        for (Food food: foods) {
            if (food.discount == DISCOUNT) {
                sumWithDiscount += (food.getPrice()) * (food.getAmount());
            }
        }
        return sumWithDiscount;     // сумму покупки без скидки;
    }

    // task 3
    public double sumVegetarianProductsWithoutDiscount() {
        double sumVegetarianProductsWithoutDiscount = 0;

        for (Food food: foods) {
            if (food.isVegetarian() == true && food.discount == DISCOUNT_ZERO) {
                sumVegetarianProductsWithoutDiscount += (food.getPrice()) * (food.getAmount());
            }
        }
        return sumVegetarianProductsWithoutDiscount;    // сумму покупки без скидки;
    }

}