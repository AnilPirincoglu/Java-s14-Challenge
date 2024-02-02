public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        setMeat("Double");
        setName("Deluxe Burger");
        setBreadRollType(BreadRollType.SANDWICH);
        setPrice(19.10);
    }
    public void addAddition(String name, double price) {
        System.out.println("Forbidden");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder= new StringBuilder();
        builder.append("Name: "+getName()+"\n");
        builder.append("Meat: "+getMeat()+"\n");
        builder.append("Bread Roll Type: "+getBreadRollType()+"\n");
        System.out.println(builder);
        System.out.println("Total Price: "+getPrice());
        System.out.println("\n*** *** *** *** ***");
    }
}
