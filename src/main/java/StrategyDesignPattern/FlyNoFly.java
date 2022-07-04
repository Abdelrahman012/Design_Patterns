package StrategyDesignPattern;

 class FlyNoFly implements FlyBehaviour{

     @Override
     public String fly() {
         return "I can not Fly";
     }
 }
