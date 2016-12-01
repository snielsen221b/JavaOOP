import java.util.ArrayList;

//def of Animal class
abstract class Animal {

  public int size;
  public String name;

  public abstract void makeNoise();

  public int getSize() {
        return size;
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
    public Dog() {}

    public Dog(int theSize, String theName) {
        size = theSize;
        name = theName;
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
    public Cat() {}

    public Cat(int theSize, String theName) {
        size = theSize;
        name = theName;
    }

    public void makeNoise() {
        System.out.println("Mew");
  }
}

class AnimalPack {

    public ArrayList<Animal> animals;

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
        for (int i = 1; i > animals.size(); i++) {
            biggest = (animals.get(i).getSize() > biggest.getSize()) ? (animals.get(i)) : (biggest);
        }
        return biggest;
    }

}

class AnimalTest {
    public static void main (String[] args){
        //tests Fetcher interface
        Fetcher f = new Dog();
        String fetched = f.fetch("tennis ball");
		System.out.println(fetched);

		// Can a cat fetch? We go to Tom with the story, Tom?
		Cat c = new Cat();
		c.fetch("tennis ball");
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
          System.out.println(anAnimalPack.biggestAnimal().getSize());
      }
  }


