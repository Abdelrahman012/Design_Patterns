package SimpleFactory;

public class CreatePizza {
    Pizza pizza;
    public Pizza CreatePizza(String type) {
        if (type.equals("ClamPizza")) {
           pizza = new ClamPizza();
        }

        if (type.equals(("PepporniPizza"))) {
            pizza = new PepporniPizza();
        }
        return  pizza;
    }
}
