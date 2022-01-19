public class Driver {
    public static void main(String...args){
       FordMustang ford = new FordMustang("mustang v8");
       Sedan sedan = new Sedan();
       System.out.print(sedan.getName());
       System.out.println(sedan.getRPM());
       System.out.print(sedan.getmodel());
       System.out.print(sedan.getClass());
       System.out.println(sedan.safetyAssessmentProgram);
       System.out.println("current class Loader "+Automobile.class.getClassLoader());
       System.out.println("current class Loader "+Sedan.class.getClassLoader());
       System.out.println("current class Loader "+Driver.class.getClassLoader());
    }
}
