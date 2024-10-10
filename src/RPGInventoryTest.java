public class RPGInventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Skapa några föremål
        Weapon sword = new Weapon("Sword", 3.0, 50, 10);
        Armor shield = new Armor("Shield", 5.0, 30, 5);
        Consumable healthPotion = new Consumable("Health Potion", 0.5, 15, "Restores 20 HP");

        // Lägg till föremål i inventariet
        inventory.addItem(sword);
        inventory.addItem(shield);
        inventory.addItem(healthPotion);

        // Visa föremål i inventariet
        inventory.displayItems();

        // Använd och utrusta föremål
        sword.attack();
        sword.equip();
        healthPotion.use();

        // Ta bort ett föremål
        inventory.removeItem(shield);

        // Visa föremål igen
        inventory.displayItems();
    }
}

