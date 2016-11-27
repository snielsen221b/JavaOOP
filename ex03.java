import java.util.ArrayList;

//def of Animal class
class Animal {

  public int size;
  public String name;

   void makeNoise() {
    System.out.println("Moooooooooo");
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
        //tests make noise
        Dog d = new Dog(4, "Billy");
        Cat c = new Cat(5, "Susan");

        d.makeNoise();
        c.makeNoise();

        //tests isBigger
        String bigger = (d.isBigger(c)) ? "the dog is bigger" : "the cat is bigger";
        System.out.println(bigger);
    }


  }

  class AnimalPackTest {
      public static void main (String[] ars) {
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


