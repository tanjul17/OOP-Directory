public class Abstract {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);

        Mustang m1 = new Mustang();
        //animal --> horse --> mustang
        // System.out.println(m1..colo);
    
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("ANimal constructor");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk(); 
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void chnageColor(){
        System.out.println("brown yellow");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs ");
    }
}
