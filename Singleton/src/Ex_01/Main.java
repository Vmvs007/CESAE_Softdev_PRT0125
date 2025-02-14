package Ex_01;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection dbConnection_01 = DatabaseConnection.getInstance("/dbc:mysql://localhost:3306/mydatabase", "14/02/2025 | 15:08:30");
        DatabaseConnection dbConnection_02 = DatabaseConnection.getInstance("/dbc:mysql://localhost:8800/mydatabase", "14/02/2025 | 15:09:12");

        dbConnection_01.connect();
        dbConnection_01.disconnect();

        dbConnection_02.connect();
        dbConnection_02.disconnect();
    }
}
