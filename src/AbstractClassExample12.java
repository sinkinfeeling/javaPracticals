abstract class Animal {
    public abstract void sound();

    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class AbstractClassExample12 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}
