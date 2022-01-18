public class child extends parent{
    String name = "child";
    child(){
        System.out.println("child constructor called");
    }   
      public void show(){
          System.out.print("child show method called!");
      }
      public void onlychildshow(){
          System.out.println("only child show method called");
      }
}
