import base.Coffee;
import factory.CupCoffeeFactory;
import factory.CondimentCoffeeFactory;
import factory.MilkCoffeeFactory;
import factory.TempratureFactory;


import java.util.Scanner;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/08/27
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎光临，请按照下列顺序选择您的咖啡！");


        System.out.println("请选择杯型：1.大杯；2.中杯；3.小杯。（默认中杯）");
        int cupType = sc.nextInt();
        Coffee coffee = CupCoffeeFactory.createCofferByCup(cupType);


        System.out.println("请输入需要的温度：1.常温；2.热饮；3.冷饮。（默认常温）");
        int temType = sc.nextInt();
        coffee = TempratureFactory.createCofferByTemprature(coffee, temType);

        System.out.println("请输入需要的牛奶类型：1.全脂牛奶；2.燕麦牛奶。（默认燕麦牛奶）");
        int milkType = sc.nextInt();
        coffee = MilkCoffeeFactory.createCofferByMilk(coffee, milkType);

        String stopFlag = "n";
        while (!stopFlag.equals("y")) {
            System.out.println("请输入需要的配料类型：1.原味糖浆；2.香草糖浆。（默认香草糖浆）");
            int syrupType = sc.nextInt();
            System.out.println("请输入所需类型的数目：");
            int sytupNum = sc.nextInt();
            coffee = CondimentCoffeeFactory.createCofferByCondiment(coffee, syrupType, sytupNum);
            System.out.println("请问配料选择结束了吗？(y/n)");
            stopFlag = sc.next();
            if (stopFlag.equals("y")) {
                break;
            }
        }
        System.out.println("选择完毕！你需要支付" + coffee.calTotalPrice() + "元");

    }
}
