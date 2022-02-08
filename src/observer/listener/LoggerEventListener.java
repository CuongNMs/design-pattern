package observer.listener;

import java.io.File;

public class LoggerEventListener implements EventListener {
    @Override
    public void notify(File file) {
        System.out.println("Logger updated: File recieve: " + file.getName());
    }
}
