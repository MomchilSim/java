package HeatBattler.Decorators;

import HeatBattler.IceCream;

public abstract class IceCreamDecorator extends IceCream {
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void create() {
        this.iceCream.create();
    }

    @Override
    public void prepare() {
        this.iceCream.prepare();
    }

    @Override
    public String getTopping() {
        return iceCream.getTopping();
    }

    @Override
    public String getType() {
        return iceCream.getType();
    }
}
