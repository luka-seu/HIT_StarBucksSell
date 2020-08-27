package factory;

import base.Coffee;
import tempsepc.ColdTempCoffee;
import tempsepc.CommonTempCoffee;
import tempsepc.HotTempCoffee;
import tempsepc.TempratureSpec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class TempratureFactory {
    public static TempratureSpec createCofferByTemprature(Coffee coffee,int tempType){
        switch (tempType) {
            case 1:
                return new CommonTempCoffee(coffee);
            case 2:
                return new HotTempCoffee(coffee);
            case 3:
                return new ColdTempCoffee(coffee);
            default:
                return new CommonTempCoffee(coffee);

        }

    }
}
