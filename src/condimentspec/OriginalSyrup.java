package condimentspec;

import base.Coffee;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class OriginalSyrup extends CondimentSpec {
    Coffee coffee;

    public OriginalSyrup(Coffee coffee,int num) {
        this.num = num;
        this.coffee = coffee;
    }

    private static final double ORIGINAL_SYRUP_PRICE = 90;


    @Override
    public String getDesc() {
        return "原味糖浆";
    }

    @Override
    public double calTotalPrice() {
        return coffee.calTotalPrice() + ORIGINAL_SYRUP_PRICE * num;
    }
}
