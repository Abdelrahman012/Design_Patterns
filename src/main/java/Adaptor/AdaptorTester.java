package Adaptor;

import java.util.ArrayList;

public class AdaptorTester {

    public static void main(String[] args) {
        ArrayList<Ienemy> ienemies = new ArrayList<Ienemy>();
        ienemies.add(new IenemyPlane());
        ienemies.add(new IenemyTank());
        ienemies.add(new SoliderAdaptor(new Solider()));
        for (Ienemy ienemy:ienemies){
            ienemy.FireCannons();
            ienemy.ReFillBanzeen();
        }

    }
}
