public class classesAndObjects{
   String name = "Lingesh";
   public static void main(String...args){
      Car audi = new Car();
      System.out.println(audi.equals("lamborghini"));
      String javas[] = {"one","two","three","four","five"};
      System.out.println(javas.toString());
      Animal cat = new Animal("puppy");
      System.out.format(Animal.cookie.toString());
      System.out.println(cat.toString());
      Animal dog = new Animal("doggy","mydog");
      System.out.println(dog);
      System.out.println(dog.name+" and  " + dog.nickname);
      System.out.println(cat.name);
      Animal.cookie = "login cookie";
      System.out.format(Animal.cookie.toString());
   }  
   public String Welcome(){
      return String.format("Welcome %s",this.name);
   }
}