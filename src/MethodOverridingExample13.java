class Animal {
    public void sound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    public void sound() {
        super.sound();  // Calling the parent class method
        System.out.println("The dog barks.");
    }
}

public class MethodOverridingExample13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
