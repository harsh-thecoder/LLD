package CreationalDesignPattern.SingletonDesignPattern.BadCode;

public class Application {
    public void run() {
        Logger logger = Logger.getInstance();
        logger.log("Application Started");
    }
}
