package Iterator;

import java.util.ArrayList;

public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dm, PancakeHouseMenu pm)
    {
        this.dinerMenu = dm;
        this.pancakeHouseMenu = pm;

    }

    public void printMenu() {
        Iterator pan = pancakeHouseMenu.getIterator();
        Iterator din = dinerMenu.getIterator();

        printMenu(pan);
        printMenu(din);

     }
     public void printMenu(Iterator i) {
        while (i.hasNext()) {
            System.out.println(((MenuItem) i.Next()).getDescription());
        }
     }

}
