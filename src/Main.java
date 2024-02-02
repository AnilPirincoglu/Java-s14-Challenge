public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", BreadRollType.WRAP, 3.56);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealtyBurger healthyBurger = new HealtyBurger("Vegan Burger", BreadRollType.SANDWICH, 5.67);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}