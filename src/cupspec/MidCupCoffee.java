package cupspec;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class MidCupCoffee extends CupSpec {

    public MidCupCoffee() {
        desc = "中杯咖啡";
    }

    public MidCupCoffee(String temp) {
        temp = "temp";
        desc = "中杯咖啡";

    }

    private static final double MID_COFFEE_PRICE = 15.00;
    @Override
    public String getDesc() {
        return "中杯咖啡";
    }

    @Override
    public double calTotalPrice() {
        return MID_COFFEE_PRICE;
    }
}
