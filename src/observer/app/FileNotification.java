package observer.app;

import observer.publisher.EventPublisher;
import observer.publisher.NotifyEventPublisher;

import java.io.File;

public class FileNotification {
    private EventPublisher notifyEventManager;
    private File file;

    public FileNotification() {
        notifyEventManager = new NotifyEventPublisher();
    }

    public void receiveFile(String filePath){
        file = new File(filePath);
        notifyEventManager.notify(file);
    }

    public EventPublisher getNotifyEventManager() {
        return notifyEventManager;
    }
}
