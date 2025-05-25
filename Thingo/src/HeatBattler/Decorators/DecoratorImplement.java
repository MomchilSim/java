package HeatBattler.Decorators;

import HeatBattler.IceCream;

public class DecoratorImplement extends IceCreamDecorator {

    private final String topping;

    public DecoratorImplement(IceCream IC, String topping) {
        super(IC);
        this.topping = topping;
    }

    @Override
    public void create() {
        super.create();
        this.addTopping();
    }

    private void addTopping() {
        iceCream.setTopping(topping);
    }
    }
