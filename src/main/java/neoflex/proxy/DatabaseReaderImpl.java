package neoflex.proxy;

public class DatabaseReaderImpl implements DatabaseStorage {

    @Override
    public String getURL(String databaseName) {
        return "localhost:port/" + databaseName;
    }
}
