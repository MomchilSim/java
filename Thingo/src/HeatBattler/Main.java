package HeatBattler;
import HeatBattler.Singleton.Store;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner myObj = new Scanner(System.in);

        System.out.println("welcome ice cream co, pick a flavor: 1:vanilla, 2:chocolate, 3:strawberry");
        char type =  myObj.nextLine().charAt(0);
        Store store = Store.getInstance();
        var currentIC = store.CreateIceCream(type);

        System.out.println("would you like a topping? 1:liquid choco, 2:chocolate sticks, any:no");
        char topping =  myObj.nextLine().charAt(0);
        currentIC = store.AddTopping(currentIC, topping);
        System.out.printf("congratulations: you made an ice cream! " + currentIC.getType() + " "  + currentIC.getTopping());
    }
}
