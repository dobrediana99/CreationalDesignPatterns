package SA_HW1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private static final String LOG_FILE = "app.log";

    // Private constructor to prevent direct instantiation
    private Logger() { }

    // Synchronized method to make the Singleton thread-safe (Task 2)
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void log(String level, String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format("%s [%s]: %s", timestamp, level, message);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logInfo(String message) {
        log("INFO", message);
    }

    public void logError(String message) {
        log("ERROR", message);
    }

    public void logWarning(String message) {
        log("WARNING", message);
    }
}

//Bonus: Enum-based Singleton for SA_HW1.Logger
//public enum SA_HW1.Logger {
//    INSTANCE;
//
//    private static final String LOG_FILE = "app.log";
//
//    public void logInfo(String message) {
//        log("INFO", message);
//    }
//
//    public void logError(String message) {
//        log("ERROR", message);
//    }
//
//    public void logWarning(String message) {
//        log("WARNING", message);
//    }
//
//    private void log(String level, String message) {
//        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//        String logMessage = String.format("%s [%s]: %s", timestamp, level, message);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
//            writer.write(logMessage);
//            writer.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

