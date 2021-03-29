package vijay.app.spacex.Utils;

public class Constant {

    public static final String APP_NAME = "SpaceX";
    public static final String BASE_URL = "https://api.spacexdata.com/";

    public static final String DB_NAME = "spaceX.database";

    public static final int CONNECTION_TIMEOUT = 20;
    public static final int READ_TIMEOUT = 20;
    public static final int WRITE_TIMEOUT = 20;

    //["active", "inactive", "retired", "unknown"]
    /*public enum STATUS {
        active("ACTIVE"),
        inactive("INACTIVE"),
        retired("RETIRED"),
        unknown("UNKNOWN");

        String status;
        STATUS(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }*/

}
