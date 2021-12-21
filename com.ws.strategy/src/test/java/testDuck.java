import com.strategy.duck.fly.RocketBehavior;
import com.strategy.duck.model.Duck;
import com.strategy.duck.model.MallardDuck;
import com.strategy.duck.model.RedheadDuck;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:44
 **/
public class testDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.preformFly();
        mallardDuck.preformQuack();
        mallardDuck.display();
        mallardDuck.swim();
        System.out.println("----------------------------");
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.preformQuack();
        redheadDuck.preformFly();
        redheadDuck.setFlyBehavior(new RocketBehavior());
        redheadDuck.preformFly();
    }
}
