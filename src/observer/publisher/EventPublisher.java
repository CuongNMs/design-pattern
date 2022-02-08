package observer.publisher;

import observer.listener.EventListener;

import java.io.File;

public interface EventPublisher {
    void subcribe(EventListener obs);
    void unsubcribe(EventListener obs);
    void notify(File file);
}
