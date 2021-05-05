import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Parser<T> {

    public List<T> parseData(Class<T> theClass, String filePath) throws FileNotFoundException {
        List<T> items = new CsvToBeanBuilder(new FileReader(filePath))
                .withType(theClass)
                .build()
                .parse();

        return items;
    }
}
