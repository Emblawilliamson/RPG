public class Consumable extends Item implements Usable {
    private String effect;

    public Consumable(String name, double weight, int goldValue, String effect) {
        super(name, weight, goldValue);
        this.effect = effect;
    }

    @Override
    public void use() {
        System.out.println(name + " used. Effect: " + effect);
    }
}

