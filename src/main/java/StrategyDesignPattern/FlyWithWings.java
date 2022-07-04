package StrategyDesignPattern;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public String fly() {
        return "I can fly with wings";
    }
}
