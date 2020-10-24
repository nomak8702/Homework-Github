package curs12.extraExercise;

import java.util.*;

public class CarShop {
    List<Car> cars = new ArrayList<>();

    public CarShop(Collection<Car> cars) {
        if (cars != null) {
            this.cars.addAll(cars);
        }
    }

    public Map<String, Integer> getNumbersCars() {
        Map<String, Integer> result = new HashMap<>();
        int count = 0;
        for (Car car : cars) {
            count++;
            result.put(car.getName(), count);
        }
        return result;
    }

    public Map<String, Integer> getNameToKm() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : cars) {
            result.put(car.getName(), car.getKm());
        }
        return result;
    }

    public Map<KmRange, List<String>> getCarsRange() {
        Map<KmRange, List<String>> result = new HashMap<>();
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getKm() > 5000) {
                names.add(car.getName());
                result.put(KmRange.RANGE10000, names);
            } else  if (car.getKm() <= 5000) {
                names2.add(car.getName());
                result.put(KmRange.RANGE5000, names2);
            }
        }
        return result;
    }

    public Map<PriceCar, List<String>> getPriceCar() {
        Map<PriceCar, List<String>> result = new HashMap<>();
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPrice() > 5000) {
                names.add(car.getName());
                result.put(PriceCar.PRICE10000, names);
            } else  if (car.getPrice() <= 5000) {
                names2.add(car.getName());
                result.put(PriceCar.PRICE5000, names2);
            }
        }
        return result;
    }
}
