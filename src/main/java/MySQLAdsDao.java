import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
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


    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement smt = connection.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM ads");
            while(rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException("error connecting to database", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        String title = ad.getTitle();
        String desc = ad.getDescription();
        String query = "INSERT INTO ads(user_id, title, description) VALUES(1, '"+title+"', '"+desc+"')";
        try {
            Statement smt = connection.createStatement();
            smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = smt.getGeneratedKeys();
            rs.next();
            System.out.println("Created a new ad, id of the ad: " + rs.getLong(1));
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("error connecting to database", e);
        }    }
}
//INSTRUCTOR SOLUTION

//public class MySQLAdsDao implements Ads{
//    private Connection connection = null;
//
//    public MySQLAdsDao(Config config) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            System.out.println(e);
//            throw new RuntimeException("error connecting to database", e);
//        }
//    }
//
//    public List<Ad> all(){
//        List<Ad> ads = new ArrayList<>();
//        try {
//            Statement smt = connection.createStatement();
//            ResultSet rs = smt.executeQuery("SELECT * FROM ads");
//            while(rs.next()) {
//                ads.add(new Ad(
//                   rs.getLong("id"),
//                   rs.getLong("user_id"),
//                   rs.getString("title"),
//                   rs.getString("description")
//                ));
//            }
//            return ads;
//        } catch (SQLException e) {
//            throw new RuntimeException("error connecting to database", e);
//        }
//    }
//
//    public Long insert(Ad ad){
//        String title = ad.getTitle();
//        String desc = ad.getDescription();
//        String query = "INSERT INTO ads(user_id, title, description) VALUES(1, '"+title+"', '"+desc+"')";
//        try {
//            Statement smt = connection.createStatement();
//            smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = smt.getGeneratedKeys();
//            rs.next();
//            System.out.println("Created a new ad, id of the ad: " + rs.getLong(1));
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("error connecting to database", e);
//        }
//    }
//
//
//}
