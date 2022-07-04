package Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList<Object> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<Object>();
        addItem("K&B a Pancake Breackfast",
                "a Pancake with scrumbled eggs and crust",
                true,2.99);

        addItem("regular Pancake Breackfast",
                "a Pancake with fried eggs and sauce",
                false,2.99);

        addItem("blueberry punCake Breackfast",
                "waffels and sauce",
                true,3.49);

    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

    Iterator getIterator() {
        Iterator iter =new ArrayListIterator(menuItems);
        return  iter;
    }
}
