package tempsepc;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class HotTempCoffee extends TempratureSpec {
    public HotTempCoffee(Coffee coffee) {
        this.coffee = coffee;
        desc = "热饮";
    }
}
