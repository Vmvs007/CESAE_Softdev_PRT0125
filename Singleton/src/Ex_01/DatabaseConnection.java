package Ex_01;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private String connectionString;
    private String creationTime;

    private DatabaseConnection(String connectionString, String creationTime) {
        this.connectionString = connectionString;
        this.creationTime = creationTime;
    }

    public static DatabaseConnection getInstance(String connectionString, String creationTime){
        if(instance==null){
            instance = new DatabaseConnection(connectionString,creationTime);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to " + this.connectionString);
    }

    public void disconnect() {
        System.out.println("Connection closed: " + this.connectionString);
    }
}
