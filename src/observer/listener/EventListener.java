package observer.listener;

import java.io.File;

public interface EventListener {
    void notify(File file);
}
