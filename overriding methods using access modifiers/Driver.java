public class Driver {
    public static void main(String...args){
        OnePlus onePlusPhone = new OnePlus("OnePlus","Android OP", "onePlus");
        System.out.println(onePlusPhone.computePrice());
        Iphone iphone = new Iphone("IPhone","IOS","IPhone");
        System.out.println();
        System.out.print(iphone.getProperties());
        System.out.println();
        System.out.print(onePlusPhone.getProperties());
        // System.out.print("driver started");
        // Property property = new ResidentialProperty("residential Property");
        // ResidentialProperty residentialProperty = new ResidentialProperty("river residential property");
        // System.out.println(property.getName());
        // System.out.println(residentialProperty.getName());
    }
}