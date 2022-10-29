import model.Apple;
import model.Food;
import model.Meat;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {

    public static void main(String[] args) {

        /*
        Код для функциональности
        Отдельно от пакетов создай класс Main с методом main.
        В методе main реализуй следующую логику:

        Инициализируй данные. Для этого создай объекты:
        Мясо в количестве 5 кг по цене 100 рублей за кг;
        Яблоки красные в количестве 10 кг по цене 50 рублей;
        Яблоки зелёные в количестве 8 кг по цене 60 рублей.

        Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        Посчитай и выведи на экран значения для созданной корзины:
        общую сумму товаров без скидки,
        общую сумму товаров со скидкой,
        сумму всех вегетарианских продуктов без скидки.
        Все переменные класса должны быть недоступны извне, если не указано иное. Доступ к ним реализуй
        через известные тебе методы: создавай только те, которые действительно нужны для реализации описанной
        функциональности.
         */

        /*
        Transport boat = new Boat(false);
        System.out.println("Является ли транспорт наземным: " + boat.isGround());

        GroundTransport motorcycle = new Motorcycle(true, 2);
        System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
        System.out.println("Количество колёс: " + motorcycle.getWheelsCount());

        GroundTransport car = new Car(true, 4);
        System.out.println("Является ли транспорт наземным: " + car.isGround());
        System.out.println("Количество колёс: " + car.getWheelsCount());

        Car sportcar = new Sportcar(true, 4);
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
         */

        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, RED);
        Food appleGreen = new Apple(8, 60, GREEN);



    }

}
