public class OnePlus extends Phone{
   OnePlus(String name, String operatingSystem, String brandName){
       super(name, operatingSystem, brandName);
       System.out.print("built oneplus in RAM");
   }
   public int computePrice(){
       return 12 + getBasePrice();
   }
   public String getProperties(){
    String properties = super.toString();
    return String.format("%s, Price : %d", properties, computePrice());
   }
}
