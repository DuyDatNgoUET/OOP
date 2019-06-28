import java.io.Serializable;

public class Weapon implements Serializable {
    String name;

    Weapon(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }
}
