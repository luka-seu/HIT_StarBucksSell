package condimentspec;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class VanillaSyrup extends CondimentSpec {
    Coffee coffee;

    public VanillaSyrup(Coffee coffee,int num) {
        this.num = num;
        this.coffee = coffee;
    }

    private static final double VANILL_SYRUP_PRICE = 100;


    @Override
    public String getDesc() {
        return "香草糖浆";
    }

    @Override
    public double calTotalPrice() {
        return coffee.calTotalPrice() + VANILL_SYRUP_PRICE * num;
    }
}
