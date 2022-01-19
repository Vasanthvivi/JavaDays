public class FordMustang implements SportsCar{
    private String model;
    FordMustang(String model){
        this.model = model;
    }
    @Override
    public String getName() {
        return "Ford Mustang";
    }

    @Override
    public String getRPM() {
        return "r59939434";
    }
    @Override
    public String getTopSpeed(){
        return "370";
    }
    public String getmodel(){
        return "v8";
    }
}