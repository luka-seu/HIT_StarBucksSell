package cupspec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class SmallCupCoffee extends CupSpec {

    private static final double SMALL_COFFEE_PRICE = 12.00;
    public SmallCupCoffee(String temp) {
        temp = temp;
        desc = "小杯咖啡";
    }
    public SmallCupCoffee() {
        desc = "小杯咖啡";
    }

    @Override
    public String getDesc() {
        return "小杯咖啡";
    }

    @Override
    public double calTotalPrice() {
        return SMALL_COFFEE_PRICE;
    }
}
