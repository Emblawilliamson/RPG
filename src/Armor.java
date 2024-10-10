public class Armor extends Item implements Equippable {
    private int defense;

    public Armor(String name, double weight, int goldValue, int defense) {
        super(name, weight, goldValue);
        this.defense = defense;
    }

    @Override
    public void equip() {
        System.out.println(name + " equipped.");
    }
}

