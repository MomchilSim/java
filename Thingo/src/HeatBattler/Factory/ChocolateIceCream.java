package HeatBattler.Factory;

import HeatBattler.IceCream;

public class ChocolateIceCream extends IceCream {
    @Override
    public void prepare() {
        this.setType("chocolate");
    }

    @Override
    public void create() {

    }
}
