package com.design.command;

abstract class Command {
    protected Machine machine;

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public abstract void execute() ;
}

class PourBaseCommand extends Command {

    Machine.Base base;

    public PourBaseCommand(Machine.Base base) {
        this.base = base;
    }

    @Override
    public void execute() {
        machine.pourBase(base);
    }
}

class PutEspressoShopCommand extends Command {

    int count;

    public PutEspressoShopCommand(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        machine.putEspressoShot(count);
    }
}

class PutSyrupCommand extends Command {

    Machine.Syrup syrup;

    public PutSyrupCommand(Machine.Syrup syrup) {
        this.syrup = syrup;
    }

    @Override
    public void execute() {
        machine.putSyrup(syrup);
    }
}
