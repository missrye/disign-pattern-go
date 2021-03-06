package com.deepocean.designpattern.behaviormode.mediator;

public class CoffeePot extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }


    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
