public class Car {
    private String name;
    Car(){
      System.out.println("empty constructor initialized!");
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
       this.name = name;
    }
    @Override
    public boolean equals(Object object){
      return true;
    }
}