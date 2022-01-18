public class Book{
    private String name = "unknown";
    private String author = "unknown author";
    Book(){
        System.out.println("empty constructor initilized");
    }
    Book(String name){
        this.name = name;
    }
    Book(String name, String author){
        this(name);
        this.author = author;
        System.out.println("setting name and author");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void checkout(){
        System.out.println("checking out "+this.name);
    }
}