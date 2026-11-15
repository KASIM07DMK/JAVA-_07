class SingleInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
        dog.sleep();
	}
}

class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
    void sleep() {
        System.out.println("Animal sleeps");
    }
    void bark() {
        System.out.println("Animal barks");
    }
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
    void eat(){
        System.out.println("Dog eats");
    }
    void sleep(){
        System.out.println("Dog sleeps");
    }
}
