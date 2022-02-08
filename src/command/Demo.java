package command;

import command.command.Command;
import command.command.TurnOffCommand;
import command.invoker.Invoker;
import command.receiver.Light;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker();
        Command turnOff = new TurnOffCommand(light);
        invoker.setCommand(turnOff);
        invoker.executeCommand();
    }
}
