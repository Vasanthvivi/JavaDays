public class Student {
    public int id;
    public String name;
    Student(int id, String name){
        System.out.print("Student constructor initialized!");
        System.out.println(this);
        this.id = id;
        this.name = name;
    }
}
