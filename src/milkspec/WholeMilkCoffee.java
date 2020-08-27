package milkspec;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class WholeMilkCoffee extends MilkSpec {
    private static final double WHOLE_MILK_PRICE = 8;
    Coffee coffee;

    public WholeMilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDesc() {
        return "全脂牛奶";
    }


    @Override
    public double calTotalPrice() {
        return coffee.calTotalPrice()+WHOLE_MILK_PRICE;
    }
}
