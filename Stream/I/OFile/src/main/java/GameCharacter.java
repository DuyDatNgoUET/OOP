import java.io.Serializable;

public class GameCharacter implements Serializable {
    int health;
    String type;
    Weapon[] weapons;
    int weapomCount;

    public GameCharacter(int health, String type) {
        this.health = health;
        this.type = type;
        this.weapons = new Weapon[10];
        this.weapomCount = 0;
    }

    void addWeapon(Weapon w) {
        weapons[weapomCount] = w;
        weapomCount++;
    }

    @Override
    public String toString() {
        String s = health + "," + type;
        for (int i = 0; i < weapomCount; i++) {
            s = s + "," + weapons[i];

        }
        return s;
    }
}
