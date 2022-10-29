package model;

public class Meat extends Food {

//    public Motorcycle(boolean ground, int wheelsCount) {
//        super(ground, wheelsCount);
//    }

    /*
    Класс Meat — для мяса. Это класс с конструктором. Конструктор принимает два входных параметра — количество
    и цену. И устанавливает для флага isVegetarian правильное значение.

    private int amount;
    private double price;
    private boolean isVegetarian;

     */


    public Meat(int amount, double price) {
        super(amount, price, false);

    }

}
