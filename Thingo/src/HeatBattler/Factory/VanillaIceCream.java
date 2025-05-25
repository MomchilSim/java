package HeatBattler.Factory;

import HeatBattler.IceCream;

public class VanillaIceCream extends IceCream {
    @Override
    public void prepare() {
        this.setType("vanilla");
    }

    @Override
    public void create() {

    }
}
