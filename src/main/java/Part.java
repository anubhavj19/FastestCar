import com.opencsv.bean.CsvBindByName;

public class Part {
    @CsvBindByName(column = "part_list_id")
    private String partListId;

    @CsvBindByName(column = "part_id")
    private String partId;

    @CsvBindByName(column = "price")
    private int price;

    @CsvBindByName(column = "speed_boost")
    private int speedBoost;

    public String getPartListId() {
        return partListId;
    }

    public void setPartListId(String partListId) {
        this.partListId = partListId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeedBoost() {
        return speedBoost;
    }

    public void setSpeedBoost(int speedBoost) {
        this.speedBoost = speedBoost;
    }
}
