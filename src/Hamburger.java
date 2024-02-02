import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable {
    private String name,meat;
    private BreadRollType breadRollType;
    private double price;

    private Addition[] additions;

    public Hamburger() {
    }

    public Hamburger(String name, BreadRollType breadRollType, double price) {
        this.name = name;
        this.meat = "Normal";
        this.breadRollType = breadRollType;
        this.price = price;
        this.additions=new Addition[4];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    @Override
    public void addAddition(String name, double price) {
        for(int i=0; i < additions.length; i++){
            if (additions[i]==null){
                additions[i]=new Addition(name, price);
                break;
            }
        }
    }

    public void itemizeHamburger(){
        StringBuilder builder= new StringBuilder();
        builder.append("Name: "+name+"\n");
        builder.append("Meat: "+meat+"\n");
        builder.append("Bread Roll Type: "+breadRollType+"\n");
        for(Addition addition:additions){
            if(addition!=null) {
                builder.append("Addition Name:" + addition.getName() + "\n");
                builder.append("Addition Price:" + addition.getPrice() + "\n");
                setPrice(getPrice() + addition.getPrice());
            }
        }
        System.out.println(builder);
        System.out.println("Total Price: "+price);
        System.out.println("\n*** *** *** *** ***");
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType=" + breadRollType +
                ", price=" + price +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Objects.equals(name, hamburger.name);
    }
}
