package factory;

import base.Coffee;
import condimentspec.CondimentSpec;
import condimentspec.OriginalSyrup;
import condimentspec.VanillaSyrup;
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
public class CondimentCoffeeFactory {
    public static CondimentSpec createCofferByCondiment(Coffee coffee, int syrupType, int sytupNum){
        switch (syrupType) {
            case 1:
                return new OriginalSyrup(coffee, sytupNum);
            case 2:
                return new VanillaSyrup(coffee, sytupNum);
            default:
                return new OriginalSyrup(coffee, sytupNum);
        }

    }
}
