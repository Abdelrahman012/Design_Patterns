package StrategyDesignPattern;

public abstract class Duck {
    private int id;
    private String name;
    private  static int counter=0;
    protected FlyBehaviour myFlyBehaviour;

    Duck()
    {
        this.id = counter++;
        this.name = "Batta"+this.id;
        this.myFlyBehaviour = new FlyWithWings();

    }

    public String swim()
    {
     return "Hey, I am swimming";
    }

    protected abstract String display();

    public void perform()
    {
        System.out.println("Hey, I am"+ this.name);
        System.out.println(this.swim());
        System.out.println(this.display());
        System.out.println(this.myFlyBehaviour.fly());
    }
}
