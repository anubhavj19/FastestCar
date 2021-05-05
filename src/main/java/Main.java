import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new Parser();
        List<Team> teams = parser.parseData(Team.class, args[0]);
        List<Car> cars = parser.parseData(Car.class, args[1]);
        List<Part> parts = parser.parseData(Part.class, args[2]);
    }
}
