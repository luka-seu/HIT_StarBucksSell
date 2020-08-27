package cupspec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class LargeCupCoffee extends CupSpec {
    public LargeCupCoffee(String temp) {
        temp = temp;
        desc = "大杯咖啡";
    }

    public LargeCupCoffee() {
        desc = "大杯咖啡";
    }

    private static final double MID_COFFEE_PRICE = 18.00;
    @Override
    public String getDesc() {
        return "大杯咖啡";
    }

    @Override
    public double calTotalPrice() {
        return MID_COFFEE_PRICE;
    }
}
