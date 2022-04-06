package ro.ase.cts.singleton;

public class DbConnection {
    private static DbConnection connection = null;

    private DbConnection() {
    }

    public static synchronized DbConnection getConnection() {
        if(connection == null) {
            connection = new DbConnection();
        }
        return connection;
    }

    public void getData() {
        System.out.println("1 Ionel Popescu 9.80");
    }
}
