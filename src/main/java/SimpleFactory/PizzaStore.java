package SimpleFactory;

public class PizzaStore {
    Pizza orderPizza(String type){
        Pizza pizza = null;
        CreatePizza pizza1 = new CreatePizza();
        pizza = pizza1.CreatePizza(type);

        pizza.getName();
        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
