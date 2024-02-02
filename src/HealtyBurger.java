public class HealtyBurger extends Hamburger implements Addable{

    private Addition[] additions;
    public HealtyBurger(String name, BreadRollType breadRollType, double price) {
        super(name, breadRollType, price);
        setMeat("Tofu");
        this.additions=new Addition[2];
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
        builder.append("Name: "+getName()+"\n");
        builder.append("Meat: "+getMeat()+"\n");
        builder.append("Bread Roll Type: "+getBreadRollType()+"\n");
        for(Addition addition:additions){
            if(addition!=null) {
                builder.append("Addition Name:" + addition.getName() + "\n");
                builder.append("Addition Price:" + addition.getPrice() + "\n");
                setPrice(getPrice() + addition.getPrice());
            }
        }
        System.out.println(builder);
        System.out.println("Total Price: "+getPrice());
        System.out.println("\n*** *** *** *** ***");
    }
}
