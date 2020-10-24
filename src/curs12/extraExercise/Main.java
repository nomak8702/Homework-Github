package curs12.extraExercise;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car("Ford", 10, 9000, 3500),
                new Car("Volkswagen", 12, 8000, 3000),
                new Car("Bmw", 5, 7500, 6000),
                new Car("Audi", 8, 9500, 4000),
                new Car("Honda", 7, 4500, 2300),
                new Car("Mercedes", 2, 1000, 9500)
        ));

        System.out.println(carShop.getNumbersCars());
        System.out.println(carShop.getNameToKm());
        System.out.println(carShop.getCarsRange());
        System.out.println(carShop.getPriceCar());
    }
}
