public class Weapon extends Item implements Equippable {
    private int damage;

    public Weapon(String name, double weight, int goldValue, int damage) {
        super(name, weight, goldValue);
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks for " + damage + " damage!");
    }

    @Override
    public void equip() {
        System.out.println(name + " equipped.");
    }
}

