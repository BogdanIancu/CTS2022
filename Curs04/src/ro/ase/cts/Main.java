package ro.ase.cts;

import ro.ase.cts.singleton.DbConnection;
import ro.ase.cts.singleton.DbConnection2;
import ro.ase.cts.singleton.SingletonRegistry;

public class Main {

    public static void main(String[] args) {
        DbConnection dbConnection = DbConnection.getConnection();
        dbConnection.getData();

        SingletonRegistry registry = new SingletonRegistry();
        DbConnection2 connection2 =
                registry.getSingleton("connection2");
        connection2.getData();
    }
}
