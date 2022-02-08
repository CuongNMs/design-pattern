package chainofresponsibility;

public class ManagerLogger {
    public static Logger getLogger(){
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNextLogger(new FileLogger(LogLevel.INFO));
        return consoleLogger;

    }
}
