package StrategyDesignPattern;

public class Magro7a extends Duck {

    Magro7a(){
        super();
        //this.myFlyBehaviour = new flyWithWings();
    }
    @Override
    protected String display() {
        return "I am hurt";
    }
}
