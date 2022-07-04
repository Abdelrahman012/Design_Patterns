package Adaptor;

public class SoliderAdaptor implements Ienemy {

    Solider tempsolider;
    public SoliderAdaptor(Solider temp){
        this.tempsolider = temp;

    }

    @Override
    public void FireCannons() {
        this.tempsolider.destroyWall();
    }

    @Override
    public void ReFillBanzeen() {
        this.tempsolider.destroyElgeesr();
    }
}
