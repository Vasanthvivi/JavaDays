public class Sedan implements Automobile{
    private String name;
    private String rpm;
    Sedan(){
        System.out.println("empty constructor of the java built in ram");
    }
    Sedan(String name,String rpm){
        this.name = name;
        this.rpm = rpm;
    }

    @Override
    public String getName() {
        return "Sedan";
    }

    @Override
    public String getRPM() {
        return "4000";
    }
    public String getmodel(){
        return "v8";
    }
}
