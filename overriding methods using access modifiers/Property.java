public class Property{
    private String propertyName = "unknown propertyName";
    private String propertyArea = "unknown Area";
    {
        System.out.print("initializing Property Class");
    }
    Property(){
        System.out.print("Property empty constructor initialized");
    }
    Property(String name){
        this.propertyName = name;
    }
    Property(String name, String area){
        this(name);
        this.propertyArea = area;
    }
    public void printDetails(){
        System.out.println("Property Name : "+this.propertyName+", Property Area : "+this.propertyArea);
    }
    public String getProperty(){
        return this.propertyName + "got area "+this.propertyArea;
    }
    public static String getName(){
        return "unknown";
    }
    public final void updateProperty(){
        System.out.println("updating property "+this.propertyName);
    }
    //Factory method
    public static Property getPropertyInstance(){
        return new Property();
    }
}