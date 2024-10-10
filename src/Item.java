public abstract class Item {
    protected String name;
    protected double weight;
    protected int goldValue;

    public Item(String name, double weight, int goldValue) {
        this.name = name;
        this.weight = weight;
        this.goldValue = goldValue;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public String getDescription() {
        return name + " (Weight: " + weight + ", Value: " + goldValue + " gold)";
    }
}

