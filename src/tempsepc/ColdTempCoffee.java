package tempsepc;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class ColdTempCoffee extends TempratureSpec {

    public ColdTempCoffee(Coffee coffee) {
        this.coffee = coffee;
        desc = "冷饮";
    }
}
