package OOP.car;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarRide {

    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    public CarRide(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }
}
