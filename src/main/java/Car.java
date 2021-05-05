import com.opencsv.bean.CsvBindByName;

public class Car {
    @CsvBindByName(column = "car_id")
    private String carId;

    @CsvBindByName(column = "car_name")
    private String carName;

    @CsvBindByName(column = "base_speed")
    private int baseSpeed;

    @CsvBindByName(column = "top_speed")
    private int topSpeed;

    @CsvBindByName(column = "part_list_id")
    private String partListId;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getPartListId() {
        return partListId;
    }

    public void setPartListId(String partListId) {
        this.partListId = partListId;
    }
}
