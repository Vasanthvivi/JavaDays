public class Animal{
    private String name = "unknown";
    private String sound = "unknown sound";
    Animal(){

    }
    Animal(String name){
       this.name = name;
    }
    Animal(String name, String sound){
        this(name);
        this.sound = sound;
    }
    public String getAnimal(){
        return this.name + "("+this.sound+")";
    }
    public void setAnimal(String name){
        this.name = name;
        System.out.println("setted animal name");
    }
}