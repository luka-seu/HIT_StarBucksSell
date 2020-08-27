package factory;

import base.Coffee;
import milkspec.MilkSpec;
import milkspec.OatMilkCoffee;
import milkspec.WholeMilkCoffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class MilkCoffeeFactory {
    public static MilkSpec createCofferByMilk(Coffee coffee, int tempType){
        switch (tempType) {
            case 1:
                return new WholeMilkCoffee(coffee);
            case 2:
                return new OatMilkCoffee(coffee);
            default:
                return new OatMilkCoffee(coffee);
        }

    }
}
