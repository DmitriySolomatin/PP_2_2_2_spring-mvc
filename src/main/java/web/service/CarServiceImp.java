package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private static final List<Car> carsList = new ArrayList<>();
    static {
        carsList.add(new Car("Tesla", "X", 1000));
        carsList.add(new Car("Tesla", "S", 2000));
        carsList.add(new Car("Tesla", "Y", 3000));
        carsList.add(new Car("Tesla", "3", 4000));
        carsList.add(new Car("Tesla", "CYBERTRUCK", 5000));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.subList(0, Math.min(count, 5));
    }
}
