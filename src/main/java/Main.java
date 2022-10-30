import model.Apple;
import model.Food;
import model.Meat;

import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");
        Meat meat = new Meat(5, 100);

        Food[] foods = new Food[3];
        foods[0] = appleRed;
        foods[1] = appleGreen;
        foods[2] = meat;

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров со скидкой равна: " + cart.sumWithoutDiscount());
        System.out.println("Общая сумма товаров без скидки равна: " + cart.sumWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки равна: " +
                cart.sumVegetarianProductsWithoutDiscount());

    }

}