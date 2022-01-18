public class AmazonEcho extends SmartSpeaker{
    public AmazonEcho(){
        super("Amazon Alexa");
    }
    public void wakeupCommand(){
        System.out.println("Wake Up Phrase: \"Alexa\"");
    }
}
