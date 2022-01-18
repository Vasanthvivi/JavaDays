package comparisons;
import comparisons.Pet;
public class PetConfig {
    public static void Main(String...args){
        System.out.println("Welcome to the pet configuration class of java");
        comparisons.Pet cat = new comparisons.Pet();
        comparisons.Pet dog = new comparisons.Pet();
        System.out.println(cat.hashCode());
        System.out.println(dog.hashCode());
        System.out.println(cat.equals(dog));
    }
}
