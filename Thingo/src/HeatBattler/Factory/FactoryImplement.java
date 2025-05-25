package HeatBattler.Factory;
import HeatBattler.IceCream;

public class FactoryImplement {

    public IceCream prepareIceCream(String iceCreamType) {
        IceCream iceCream = this.createIceCream(iceCreamType);
        iceCream.prepare();
        return iceCream;
    }
    public IceCream createIceCream(String iceCreamType){
        if(iceCreamType.equals("strawberry")) {
            return new StrawberryIceCream();
        }
        if(iceCreamType.equals("chocolate")) {
            return new ChocolateIceCream();
        }
        if (iceCreamType.equals("vanilla")){
            return new VanillaIceCream();

        }
        return null;
    }
}
