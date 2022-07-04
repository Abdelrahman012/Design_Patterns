package Adaptor;

public class IenemyPlane implements Ienemy{

    @Override
    public void FireCannons() {
        System.out.println("Plane Firing Cannons");
    }

    @Override
    public void ReFillBanzeen() {
        System.out.println("plane is refilling banzeen");
    }
}
