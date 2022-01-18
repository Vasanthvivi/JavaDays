public class references {
    public static void main(String...args){
        Car sedan = new Car();
        sedan.setName("Sedan");
        System.out.println(sedan.getName());
    }
    public void updateData(Car car){
        car.setName("Audi");
        System.out.println(car.getName());
    }
}
