package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String filePath;

    private static Logger instance;

    private Logger(String filePath) {
        this.filePath = filePath;
    }

    public static Logger getInstance(String filePath) {
        if (instance == null) {
            instance = new Logger(filePath);
        }

        return instance;
    }

    public void log(String logMessage) throws IOException {

        FileWriter fw = new FileWriter(new File(this.filePath), true);

        fw.append(logMessage + "\n");

        fw.close();
    }
}
