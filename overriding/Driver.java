public class Driver {
   public static void main(String...args){
       System.out.print("Driver started!");
       Animal lion = new Animal("lion","roars");
       Cat puppy = new Cat("Puppy","meows");
       //overriding the base class
       System.out.println(puppy.getAnimal());
       System.out.println(lion.getAnimal());
    } 
}
