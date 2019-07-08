package MultiInheritance;

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero mario = new Hero();
        t(mario); // fight
        u(mario); // swim
        v(mario); // fly
        w(mario); // fight
    }
}
