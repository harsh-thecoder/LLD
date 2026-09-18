package CreationalDesignPattern.SingletonDesignPattern.GoodCode;

/*
    We wanted to have same instance across the codebase
    So, we used Singleton Design Pattern to avoid multiple instance creation
*/
public class Main {
    public static void main(String args[]) {
        Application application = new Application();
        application.run();
    }
}
