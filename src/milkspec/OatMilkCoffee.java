package milkspec;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class OatMilkCoffee extends MilkSpec {
    private static final double OAT_MILK_PRICE = 10;
    Coffee coffee;

    public OatMilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDesc() {
        return "燕麦牛奶";
    }


    @Override
    public double calTotalPrice() {
        return coffee.calTotalPrice()+OAT_MILK_PRICE;
    }
}
