package factory;

import base.Coffee;
import cupspec.CupSpec;
import cupspec.LargeCupCoffee;
import cupspec.MidCupCoffee;
import cupspec.SmallCupCoffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class CupCoffeeFactory {
    public static CupSpec createCofferByCup(int cupType){
        switch (cupType) {
            case 1:
                return  new LargeCupCoffee();
            case 2:
                return new MidCupCoffee();

            case 3:
                return new SmallCupCoffee();

            default:
                return new MidCupCoffee();
        }

    }
}
