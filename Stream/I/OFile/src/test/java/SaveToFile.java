import java.io.*;

public class SaveToFile {
    public static void main(String[] args) {
        GameCharacter zombie = new GameCharacter(50, "Zombie");
        zombie.addWeapon(new Weapon("teeth"));
        zombie.addWeapon(new Weapon("hands"));

        GameCharacter peaShooter = new GameCharacter(40, "PeaShooter");
        peaShooter.addWeapon(new Weapon("gun"));

        GameCharacter mushroom = new GameCharacter(30, "MagicMushroom");
        mushroom.addWeapon(new Weapon("poison"));
        mushroom.addWeapon(new Weapon("light"));

        // write file
        try {
            FileOutputStream fileStream = new FileOutputStream("game.dat");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(zombie);
            os.writeObject(peaShooter);
            os.writeObject(mushroom);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // print file
        try {
            FileInputStream fileStream = new FileInputStream("game.dat");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            GameCharacter o1 = (GameCharacter) os.readObject();
            GameCharacter o2 = (GameCharacter) os.readObject();
            GameCharacter o3 = (GameCharacter) os.readObject();
            os.close();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o3);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
