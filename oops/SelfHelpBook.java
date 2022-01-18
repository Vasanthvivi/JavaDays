public class SelfHelpBook extends Book{
    SelfHelpBook(){
        System.out.println("selfhelpbook empty constructor initialized!");
    }
    SelfHelpBook(String name){
        super(name);
        System.out.println("selfhelpbook empty constructor initialized!");
    }
    SelfHelpBook(String name, String author){
        super(name, author);
    }
    @Override
    public String getName(){
        return "book : ";
    }
    public String downCast(){
        Book book = new Book();
        SelfHelpBook b = (SelfHelpBook)book;
        return b.toString();
    }
    public void checkoutnew(){
        System.out.println("checking out new "+this.getName());
    }
}