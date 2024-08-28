public class Abclassb{
    public static void main(String fun[]){
    
        Horse  h = new Horse();
        h.walk();
    }
}

abstract class AnimaL{

    abstract void walk();

    
}
class Horse extends AnimaL{
    void walk(){
        System.out.println("horse walks");
    }
}