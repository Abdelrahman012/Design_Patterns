package SimpleFactory;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "clam Pizza";
        dough = "thin crust";
        sauce = "White Garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated Premson Cheese");
    }
}
