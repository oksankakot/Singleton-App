import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;

    private List<String> messages;

    private Logger() {
        messages = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        messages.add(message);
    }

    public void printLogs() {
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}