package CreationalDesignPattern.SingletonDesignPattern.BadCode;

public class Logger {
    // Variable to hold single instance
    private static Logger instance;
    // constructor to prevent instantiation
    private Logger() {}
    public static Logger getInstance() {
 // If multiple threads come together then they will get different instances which is to be avoided
 // So, we have used synchronized keyword which will process threads one by one       
 // public static synchronized Logger getInstance() { is also a bad code 
 // as it Synchronizes the complete process. 
 // In that case if multiple threads are there then they will have to wait for whole process
 // Whereas it should wait for just "if condition" only 
 // Once instance is available all the threads can get that parallel and synchronization is not required in that case         
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log : " + message);
    }
}
