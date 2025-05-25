package HeatBattler.Singleton;

import HeatBattler.Decorators.DecoratorImplement;
import HeatBattler.Factory.FactoryImplement;
import HeatBattler.IceCream;

public class Store {
    private static Store instance;
    private FactoryImplement fac = new FactoryImplement();

    private Store() {}

    public static Store getInstance() {
        if (instance == null){
            instance = new Store();
        }
        return instance;
    }
    public IceCream CreateIceCream(char input){
        String flavor = "";
        switch(input) {
            case '1':
                flavor = "vanilla";
                break;
            case '2':
                flavor = "chocolate";
                break;
            case '3':
                flavor = "strawberry";
            default:
                if (flavor.isEmpty()) {
                    return fac.prepareIceCream("vanilla");
                }
        }
        return fac.prepareIceCream(flavor);
    }
    public IceCream AddTopping(IceCream iceCream,char input){
        String topping = "";
        switch(input) {
            case '1':
                topping = "choco sauce";
                break;
            case '2':
                topping = "choco sticks";
                break;
            default:
                break;
        }
        iceCream = new DecoratorImplement(iceCream,  topping);
        iceCream.create();
        return  iceCream;
    }
    public void connect(String token) {
        System.out.println("Connecting with: " + token);
    }
}
