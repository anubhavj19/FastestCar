import com.opencsv.bean.CsvBindByName;

import java.util.HashMap;
import java.util.List;

public class Team {
    @CsvBindByName(column = "team_id")
    private int teamId;

    @CsvBindByName(column = "team_name")
    private String teamName;

    @CsvBindByName(column = "cars")
    private String carId;

    @CsvBindByName(column = "funds")
    private int funds;

    List<Car> cars;

    private Car fastestCar;

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getFunds() {
        return funds;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getFastestCar() {
        return fastestCar;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setFastestCar(Car fastestCar) {
        this.fastestCar = fastestCar;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }
}
