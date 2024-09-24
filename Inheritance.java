// Show the concept of inheritance of a class by another class . 
//Also implement the concept of type casting of the instance of the classes defined 
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
// Parent class (superclass)

// Child class (subclass) inheriting from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Name : Komal Paul , Roll No : 226902");
        Dog dog = new Dog();
        dog.name = "Buddy";
        
        // Accessing methods from both the parent and child class
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark();  // Method of Dog class

        // Demonstrating type casting
        Animal animal = dog; // Upcasting: Dog is cast to its superclass Animal
        animal.eat();  // Can still access Animal's methods
        // animal.bark(); // Error: Can't access Dog-specific methods with Animal reference

        // Downcasting: Casting back to Dog
        Dog castedDog = (Dog) animal; // Must cast explicitly
        castedDog.bark(); // Now we can access Dog-specific methods
    }
}
