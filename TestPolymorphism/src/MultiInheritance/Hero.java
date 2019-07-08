package MultiInheritance;

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    @Override
    public void fly() {
        System.out.println("can fly");
    }

    @Override
    public void swim() {
        System.out.println("can swim");
    }
}
