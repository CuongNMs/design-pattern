package chainofresponsibility;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel level, String msg){
        if(logLevel.getLevel() < level.getLevel()){
            writeMessage(msg);
        }
        if(nextLogger != null){
            nextLogger.log(level, msg);
        }
    }
    protected abstract void writeMessage(String msg);
}
