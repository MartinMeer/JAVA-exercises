package OOP.car;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Customer {

    @Getter @Setter private String name;
    @Getter private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }
    public void addRide(CarRide carRide) {
        rides.add(carRide);
    }
}
