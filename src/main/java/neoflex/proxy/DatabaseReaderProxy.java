package neoflex.proxy;

import java.util.HashMap;
import java.util.Map;

//все выводы информации для наглядности
public class DatabaseReaderProxy implements DatabaseStorage {

    private DatabaseReaderImpl databaseReader;
    private Map<String, String> cache;

    public DatabaseReaderProxy(DatabaseReaderImpl databaseReader) {
        this.databaseReader = databaseReader;
        cache = new HashMap<>();
    }

    @Override
    public String getURL(String databaseName) {
        if (!cache.containsKey(databaseName)) {
            System.out.println("Добавили в кэш: " + databaseName);
            String databaseURL = databaseReader.getURL(databaseName);
            cache.put(databaseName, databaseURL);
        }
        String URL = cache.get(databaseName);
        System.out.println("Подключено к базе данных: " + URL);
        return URL;
    }
}
