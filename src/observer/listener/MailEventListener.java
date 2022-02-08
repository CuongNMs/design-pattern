package observer.listener;

import java.io.File;

public class MailEventListener implements EventListener {
    @Override
    public void notify(File file) {
        System.out.println("Mail updated: File recieve: "+ file.getName());
    }
}
