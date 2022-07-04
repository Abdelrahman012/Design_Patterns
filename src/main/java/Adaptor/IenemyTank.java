package Adaptor;

public class IenemyTank implements Ienemy{
    @Override
    public void FireCannons() {
        System.out.println("Tank firing cannons");
    }

    @Override
    public void ReFillBanzeen() {
        System.out.println("Tank refilling Banzeen");
    }
}
