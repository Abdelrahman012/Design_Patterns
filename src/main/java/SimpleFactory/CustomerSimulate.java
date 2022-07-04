package SimpleFactory;

public class CustomerSimulate {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza CustomerPizza = store.orderPizza("ClamPizza");

        System.out.println(CustomerPizza);
    }

}
