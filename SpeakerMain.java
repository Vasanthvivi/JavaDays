public class SpeakerMain {
    public static void main(String...args){
       SmartSpeaker googleNest = new SmartSpeaker("Google Nest");
       SmartSpeaker amazonEcho = new AmazonEcho();
       SmartSpeaker applePod = new ApplePod();
       System.out.println(googleNest.getProductName());
       System.out.println(amazonEcho.getProductName());
       System.out.println(applePod.getProductName());
       applePod.wakeupCommand();
       googleNest.wakeupCommand();
    }
}
