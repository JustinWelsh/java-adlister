import java.sql.DriverManager;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            // STEP ONE: Register Driver
            DriverManager.registerDriver(new Driver());
            // STEP TWO: Create connection
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }


}
