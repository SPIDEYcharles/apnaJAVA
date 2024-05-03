public class oop{
    public static void main(String[] args) {
        
        Carnivour c1= new Carnivour();
        c1.eat();
    }
}
class Animals extends oop{
    void eat(){
        System.out.println("eats food");
    }
}
class Herbivour extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}
class Carnivour extends Animals{
    
}
