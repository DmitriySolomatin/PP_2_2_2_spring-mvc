package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private static final List<Car> carsList = new ArrayList<>();
    static {
        carsList.add(new Car("Tesla", "X", 1000));
        carsList.add(new Car("Tesla", "S", 2000));
        carsList.add(new Car("Tesla", "Y", 3000));
        carsList.add(new Car("Tesla", "3", 4000));
        carsList.add(new Car("Tesla", "CYBERTRUCK", 5000));
        carsList.add(new Car("Tesla", "Roadster", 6000));
        carsList.add(new Car("Tesla", "Semi", 7000));
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count >= 5) {
            return carsList;
        } else {
            return carsList.subList(0, count);
        }
    }
}
