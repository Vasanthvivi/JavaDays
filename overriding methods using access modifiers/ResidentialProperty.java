public class ResidentialProperty extends Property{
    private String residentialPropertyName;
    private String residentialPropertyArea;
    private final String residentialPropertyCode = "369369369";
    ResidentialProperty(String name){
        super(name);
        this.residentialPropertyName = name;
        System.out.println("invoking single parameter constructors");
    }
    ResidentialProperty(String name, String area){
        super(name, area);
        this.residentialPropertyName = name;
        this.residentialPropertyArea = area;
        System.out.println("invoking two parametrized constructors");
    }
    @Override
    public void printDetails(){
        System.out.print("Residential Property : "+this.getProperty());
    }
    public void checkoutResidentialPrperty(){
        super.printDetails();
        System.out.print("checking out residential property "+this.getProperty());
    }
    public static String getName(){
        return "residential";
    }
    //Facing Error cause final
    // public void setCode(String code){
    //     this.residentialPropertyCode = code;
    // }
    //cannot override the final method in the base class
    // @Override
    // public void updateProperty(){

    // }
}
