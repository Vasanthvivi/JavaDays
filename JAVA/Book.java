public class Book {
    private String name = "unknown";
    private String price;
    Book(){

    }
    Book(String name){
        this.name = name;
        System.out.println("empty constructor initialized!");
    }
    
    Book(String name,String price){
       this.name = name;
       this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void checkout(){
        System.out.println(this.name + " cheking out!");
    }
    @Override
    public String toString(){
        return String.format("Name %s",this.name);
    }
    
}
