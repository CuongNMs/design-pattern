package observer;

import observer.listener.EventListener;
import observer.app.FileNotification;
import observer.listener.LoggerEventListener;
import observer.listener.MailEventListener;

public class Demo {
    public static void main(String[] args) {
        FileNotification fileNotification = new FileNotification();
        EventListener logger = new LoggerEventListener();
        EventListener mail = new MailEventListener();
        fileNotification.getNotifyEventManager().subcribe(logger);
        fileNotification.getNotifyEventManager().subcribe(mail);
        fileNotification.receiveFile("Users/cuongminh/Desktop/HelloWorld/HelloWorld.xcodeproj");
        fileNotification.getNotifyEventManager().unsubcribe(mail);
        fileNotification.receiveFile("Users/cuongminh/Desktop/HelloWorld/HelloWorld.xcodeproj");
    }
}
