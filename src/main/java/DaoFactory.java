

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            //Create an instance of MySQLAdsDao, create an instance of your Config class to pass to the MySQLAdsDao constructor
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}

//INSTRUCTOR SOLUTION

//public class DaoFactory {
//    private static Ads adsDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            Config config = new Config();
//            adsDao = new MySQLAdsDao(config);
//        }
//        return adsDao;
//    }
//}
