import java.util.Objects;

/*В классе Car переопределите методы equals() и hashCode() так, чтобы сравнение двух объектов класса Car происходило по содержимому.
Считаем, что автомобили идентичны, если у них совпадают марка, модель и год выпуска.*/
public class Car {

    private String made;
    private String model;
    private int produced;

    public Car(String made, String model, int produced) {
        this.made = made;
        this.model = model;
        this.produced = produced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return produced == car.produced && this.made.equals(car.made) && this.model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(made, model, produced);
    }
}
