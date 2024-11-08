package OOP.car;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Car {

    private String model;
    private String vin;
    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        this.rides = new ArrayList<>();
    }

    public void addRide(CarRide carRide) {
        rides.add(carRide);
    }
}
