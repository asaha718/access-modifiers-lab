import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<String> cars = new ArrayList() {
        {
            add("sedans");
            add("pick ups");
        }
    };

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public List<String> getCars() {
        return cars;
    }

    public List<String> addCar(String carName) {
        cars.add(carName);
        return cars;
    }
}
