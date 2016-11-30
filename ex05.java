import java.util.ArrayList;

//def animal class
class Animal {
	public int size;
	public String name;

	public Animal() {
	}

	public Animal(int size, String name) {
		this.size = size;
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("Mooooooooo");
	}

	public int getSize() {
		return size;
	}

	boolean isBigger(Animal anAnimal) {
		int size2 = anAnimal.getSize();

		return (size > size2);
	}
}


//def of dog class
class Dog extends Animal {

	public Dog() {}

	public Dog(int size, String name) {
		super(size, name);
	}

	public void makeNoise() {
		System.out.println("Ruff! Ruff!");
	}


}

//def of cat class
class Cat extends Animal {
	public Cat() {}

	public Cat(int size, String name) {
		super(size, name);
	}


	public void makeNoise() {
		System.out.println("Meow.");
	}
}

class AnimalPack {

	public ArrayList<Animal> animals;

	void makeArray(int size) {
		animals = new ArrayList<>(size);
	}

	void addAnimal() {
		Animal a = (Math.random() > .5) ? new Dog() : new Cat();
		if (Math.random() > .5) {
			Animal d = new Dog();
			animals.add(d);
		}
		else {
			Animal c = new Cat();
			animals.add(c);
		}
	}
}

class AnimalTestDrive {
	public static void main(String[] args) {
		//make new dog
		Animal d = new Dog(23, "Brian");

		//make new cat
		Animal c = new Cat(24, "Bill");

		//see which is bigger
		if (d.isBigger(c)) {
			System.out.println("The dog is bigger");
		} else {
			System.out.println("The cat is bigger");
		}

		String bigger = d.isBigger(c) ? "Dog" : "Cat";
		System.out.println(bigger);

		//make new animal pack
		AnimalPack pack = new AnimalPack();

		

	}
}



















