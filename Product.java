public class Product {
    private String name;
    private int id;
    Product(){
        System.out.println("empty product initialization!");
    }
    Product(String name){
        this.name = name;
        System.out.format("new product added -- "  + this.name);
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public void update(String name){
        System.out.format("\nupdating name of the product!");
        this.name = name;
    }
    public void update(int id, String name){
        System.out.format("\nupdating name and id as well");
        this.name = name;
        this.id  = id;
    }
}
