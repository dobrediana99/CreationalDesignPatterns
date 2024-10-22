package SA_HW1;

public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logInfo("Application started.");

        // Configuration Manager usage
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String appMode = configManager.getProperty("app.mode");
        logger.logInfo("Application Mode: " + appMode);

        // Updating configuration
        configManager.setProperty("max.user.count", "500");
        logger.logInfo("Max user count updated to 500.");
    }
}


