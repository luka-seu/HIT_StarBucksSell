package base;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public abstract class Coffee {
    public String desc = "unknown";

    public abstract double calTotalPrice();

    public  String getName(){
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
