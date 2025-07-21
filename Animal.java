class Animal {
    void sound() {
        System.out.println("Some sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}