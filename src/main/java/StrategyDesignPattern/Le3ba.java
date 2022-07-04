package StrategyDesignPattern;

public class Le3ba extends Duck{

    Le3ba() {
        super();
        this.myFlyBehaviour = new FlyNoFly();
    }

    @Override
    protected String display() {
        return "I am l3ba";
    }
}
