public class Animal {
    public String name;
    public String nickname;
    public static String cookie = "default cookie";
    Animal(){
        System.out.format("empty constructor initialized");
    }
    Animal(String name){
        this.name = name;
    }
    Animal(String name, String nickname){
       this(name);
       System.out.println(this);
       this.nickname = nickname;
    }
    public static void staticmethod(){
        
    }
    public void nonstaticmethod(){
        staticmethod();
    }
}