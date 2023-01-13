import java.net.SocketTimeoutException;

public class Inheritance {
    public static void main(String[] args) {
        // single inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // multilevel inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs=4;
        // System.out.println(dobby.legs );

        // hierarchial inheritance
        //hybrid 
        Tuna t1 = new Tuna();
        t1.size(); 

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    // int legs;
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Bhau bhau..");
    }
}

class Cat extends Mammal {
    void voice() {
        System.out.println("Meaw Meaw..");
    }
}

class Human extends Mammal {
    void awaz() {
        System.out.println("are bhai bhaii..");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Tuna extends Fish {
    void size() {
        System.out.println("choti hoti h");
    }
}

class shark extends Fish {
    void behavior() {
        System.out.println("bhaynker hoti h..");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Peacock extends Bird {
    void behavior() {
        System.out.println("fly and walk");
    }
}
// class Dog extends Mammal{
// String breed;

// }

// Derived class
// class Fish extends Animal{
// int fish;

// void swim(){
// System.out.println("swims in water");
// }
// }