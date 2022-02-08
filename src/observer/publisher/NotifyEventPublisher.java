package observer.publisher;

import observer.listener.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NotifyEventPublisher implements EventPublisher {
    private List<EventListener> eventListeners = new ArrayList<>();

    @Override
    public void subcribe(EventListener obs) {
        if(!eventListeners.contains(obs)){
            eventListeners.add(obs);
            System.out.println("Already added listener to list");
        }
    }

    @Override
    public void unsubcribe(EventListener obs) {
        if(eventListeners.contains(obs)){
            eventListeners.remove(obs);
            System.out.println("Already removed listener from list");
        }
    }

    @Override
    public void notify(File file) {
        for (EventListener obs: eventListeners) {
            obs.notify(file);
        }
    }
}
