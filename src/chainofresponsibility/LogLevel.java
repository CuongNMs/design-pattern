package chainofresponsibility;

public enum LogLevel {
    INFO(1), DEBUG(2), WARNING(3);
    private int level;
    private LogLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
}
