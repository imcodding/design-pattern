package com.design.command;

import java.util.ArrayList;

public class CoffeeMachine {

    private Machine machine = new Machine();
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void make() {
        for(Command command : commands) {
            command.setMachine(machine);
            command.execute();
        }
    }
}
