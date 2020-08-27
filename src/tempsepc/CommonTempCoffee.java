package tempsepc;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class CommonTempCoffee extends TempratureSpec {
    public CommonTempCoffee(Coffee coffee) {
        this.coffee = coffee;
        desc = "常温";
    }
}
