package OOP.car;

import java.time.LocalDate;

public class App {
    public static CarRide getRide(Customer customer, Car car) {
        CarRide carRide = new CarRide(customer, car);
        carRide.setStartedAt(LocalDate.now());
        car.addRide(carRide);
        customer.addRide(carRide);
        return carRide;
    }
}
