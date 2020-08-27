package tempsepc;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public abstract class TempratureSpec extends Coffee {

    Coffee coffee;
    @Override
    public double calTotalPrice() {
        return coffee.calTotalPrice();
    }
}
