public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Message 1: App started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Message 2: Some action is performed");

        System.out.println("Are examples similar? " + (logger1 == logger2));

        System.out.println("\nAll saved logs:");
        logger1.printLogs();
    }
}