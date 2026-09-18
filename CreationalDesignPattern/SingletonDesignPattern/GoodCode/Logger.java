package CreationalDesignPattern.SingletonDesignPattern.GoodCode;

public class Logger {
    // Variable to hold single instance
    private static Logger instance;
    // constructor to prevent instantiation
    private Logger() {}
    public static Logger getInstance() {
        if(instance == null) {
            synchronized (Logger.class) {
                
                if(instance == null) {  // might be possible after first thread some other thread has came in block so this check has to be there for multiple instance creation 
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log : " + message);
    }
}
