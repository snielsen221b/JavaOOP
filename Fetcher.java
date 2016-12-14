import java.util.*;
import java.io.*;

//def of Animal class
abstract class Animal implements Comparable<Animal>{

  	public int size;
  	public String name;

	public Animal() {};

	public Animal(int size, String name) {
		this.size = size;
		this.name = name;
	}

  	public abstract void makeNoise();

  	public int getSize() {
        return size;
    }

    class sizeCompare implements Comparator<Animal> {
		public int compare(Animal one, Animal two) {
			return one.getSize().compareTo(two.getSize());
		}
	}


  	boolean isBigger(Animal anAnimal) {
        int size2 = anAnimal.getSize();

        return (size > size2);
    }


}

//def of fetcher interface
public interface Fetcher {
    public abstract  String fetch(String string);
}

//def of dog class
class Dog extends Animal implements Fetcher{
    public Dog() {
		System.out.println("Bark");
	}

    public Dog(int size, String name) {
        super(size, name);
    }

    public void makeNoise() {
        System.out.println("Ruff! Ruff!");
  }

    public int getSize() {
    return size;
  }

    void setSize(int aSize) {
    size = aSize;
  }

    public String fetch(String string) {
        String fetched = "Damp ";
        fetched = fetched + string;
        return fetched;
    }

}

//def of cat class
class Cat extends Animal {
    public Cat() {
		System.out.println("Meow");
	}

	public Cat(int size, String name) {
		super(size, name);
	}

	public int getSize() {
		return size;
	}

    public void makeNoise() {
        System.out.println("Mew");
  }
}

class AnimalPack {

    private ArrayList<Animal> animals;

    public AnimalPack() {
        animals = new ArrayList<>();
    }

    public void addAnmial(int index, Animal anAnimal) {
        animals.add(index, anAnimal);
    }

    public void makeNoise() {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }

    public Animal biggestAnimal() {
        Animal biggest = animals.get(0);
        for (int i = 0; i > animals.size(); i++) {
            biggest = (animals.get(i).getSize() > biggest.getSize()) ? (animals.get(i)) : (biggest);
        }
        return biggest;
    }

    public void showAnimals() {
		for (int i = 0; i > animals.size(); i++) {
			System.out.println(animals.get(i).name);
			System.out.println(animals.get(i).size);
		}
	}

    public double geoMean() {
		double total = 1;
		double size = animals.size();
		double power = 1/size;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			total = total*animals.get(i).getSize();
		}
		return Math.pow(total, power);
	}

	public static double geoMean2(AnimalPack animalPack) {
		double total = 1;
		double size = animalPack.animals.size();
		double power = 1/size;
		// iterates through pack to get 'total'
		for (int i = 0; i < size; i++) {
			total = total*animalPack.animals.get(i).getSize();
		}
		return Math.pow(total, power);
	}

	
}

class AnimalTest {
    public static void main (String[] args){
        //tests Fetcher interface
        Fetcher f = new Dog();
        String fetched = f.fetch("tennis ball");
		System.out.println(fetched);

		// Can a cat fetch? We go to Tom with the story, Tom?
		Cat c = new Cat(4, "Sammy");
		//c.fetch("tennis ball");
		//it can't
    }


  }

  class AnimalPackTest {
      public static void main (String[] ars) {
          //checks that animal class is abstract, should return error
          //Animal a = new Animal();

          //makes animal pack
          AnimalPack anAnimalPack = new AnimalPack();

          //randomly populates
          for (int i = 0; i < 4; i++) {
              Animal anAnimal = (Math.random() > .5) ? (new Dog(3, "dog")) : (new Cat(2, "cat"));
              anAnimalPack.addAnmial(i,anAnimal);
          }

          anAnimalPack.makeNoise();

		  anAnimalPack.showAnimals();
		  double geo = anAnimalPack.geoMean();
		  double geo2 = anAnimalPack.geoMean2(anAnimalPack);

		  System.out.println("geoMean: " + geo);
		  System.out.println("geoMean 2: " + geo2);
      }
  }


