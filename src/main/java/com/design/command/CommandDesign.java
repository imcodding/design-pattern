package com.design.command;

public class CommandDesign {

    public CommandDesign() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addCommand(new PourBaseCommand(Machine.Base.MILK));
        coffeeMachine.addCommand(new PutEspressoShopCommand(2));
        coffeeMachine.addCommand(new PutSyrupCommand(Machine.Syrup.VANILLA));

        coffeeMachine.make();
    }
}
