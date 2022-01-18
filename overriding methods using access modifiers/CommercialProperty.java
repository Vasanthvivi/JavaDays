public class CommercialProperty extends Property{
    private String commercialPropertyName;
    private String commercialPropertyArea;
    private final String[] commercials = new String[5];
    private int commercialsCount = 0;
    CommercialProperty(String name){
        super(name);
        commercials[this.commercialsCount++] = "commercials "+this.commercialsCount;
        this.commercialPropertyName = name;
        System.out.println("invoking single parameter constructors");
    }
    CommercialProperty(String name, String area){
        super(name, area);
        this.commercialPropertyName = name;
        this.commercialPropertyArea = area;
        System.out.println("invoking two parametrized constructors");
    }
    @Override
    public void printDetails(){
        System.out.print("commercial Property : "+this.getProperty());
    }
    public void checkoutcommercialPrperty(){
        System.out.print("checking out commercial property "+this.getProperty());
    }
    public static String getName(){
        return "commercial";
    }
}
