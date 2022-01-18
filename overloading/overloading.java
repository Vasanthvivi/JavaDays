
public class overloading{

    private int firstValue = 0;
    private int secondValue = 0;

    overloading(){
        System.out.println("overloading empty constructor initialized");
    }
    public void run(int a){
        System.out.println("getting one parametrized method");
        System.out.print(a);
        this.firstValue = a;
    }

    public void run(int a, int b){
        System.out.print("getting in two parametrized method");
        System.out.println("first value "+a+", second value "+b);
        this.firstValue = a;
        this.secondValue = b;
    }

    public void add(int a, float b){
        //type promotions
        System.out.println("addition operation value is "+ (a + b));
    }

    public void promoteType(float a, double b){
        double c = (a+b);
        System.out.println(c);
    }

    overloading(int a){
        this.firstValue = a;
        System.out.println("constructor overloaded with sort of value");
    }

}