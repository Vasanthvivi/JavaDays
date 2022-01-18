public class SmartSpeaker{
    private String productName = "unknown";
    SmartSpeaker(String name){
        this.productName = name;
    }
    public String getProductName(){
        return this.productName;
    }
    public void wakeupCommand(){
        System.out.format("Call %s to wake up!",this.productName);
    }
}