// Java does not support multiple inheritance with classes.
// Multiple inheritance can be achieved by implementing multiple interfaces.
interface Swimmable {
	void swim();
}

interface Runnable {
	void run();
}

class Duck implements Swimmable, Runnable {
	@Override
	public void swim() {
		System.out.println("Swimmming...");
	}

	@Override
	public void run() {
		System.out.println("Running...");
	}
}

class MultipleInheritance {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.swim();
		d.run();
	}
}
