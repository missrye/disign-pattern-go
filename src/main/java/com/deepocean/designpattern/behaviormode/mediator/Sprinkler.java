package com.deepocean.designpattern.behaviormode.mediator;

public class Sprinkler extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }


    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
