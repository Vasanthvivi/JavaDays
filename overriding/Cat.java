public class Cat extends Animal{
   Cat(String name, String sound){
       super(name, sound);
   }
   public void catMethod(){
       System.out.println("cat meows");
   }    
   @Override
   public String getAnimal(){
       return "Cat : meows";
   }
}
