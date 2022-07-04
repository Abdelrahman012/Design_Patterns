package Iterator;

import java.awt.*;

public class DinerMenu {
    static final int maxitems = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[maxitems];

        addItem("Vegeterian BLT",
                "Fackin",
                true,2.99);

        addItem("BLT",
                "Bacon",
                false,2.99);

        addItem("Soup",
                "soup of day with potatoes",
                false,3.49);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems < maxitems) {
            System.out.println("sorry, Menu is full");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems+1;
        }

    }

    Iterator getIterator (){
        Iterator iterator =new ArrayIterator(menuItems);
        return  iterator;
    }
}
