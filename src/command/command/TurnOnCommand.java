package command.command;

import command.receiver.Light;

public class TurnOnCommand implements Command{
    private Light light;

    @Override
    public void execute() {
        light.turnOn();
    }
}
