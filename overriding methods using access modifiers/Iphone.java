public class Iphone extends Phone{
    private final String aipods = "true";
    Iphone(String name, String operatingSystem, String brandName){
        super(name, operatingSystem, brandName);
        System.out.print("successfully built iphone in the RAM");
    }
    public int computePrice() {
        return getBasePrice() + 15;
    }
    public String getProperties(){
        String properties = super.toString();
        return String.format("%s, Price : %d", properties, computePrice());
    }
}
