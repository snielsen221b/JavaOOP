//def of dog class
class Dog {

  int size;
  String breed;
  String name;

  public Dog() {}

  public Dog(int size, String breed, String name) {
    this.size = size;
    this.breed = breed;
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  void setSize(int aSize) {
    size = aSize;
  }

  void bark() {
    System.out.println("Ruff! Ruff!");
  }

  boolean isBigger(Dog aDog) {
    int size2 = aDog.getSize();

    if (size > size2) {
      return true;
    }
    else {
      return false;
    }
  }

}

//def of cat class
class Cat {

  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("I'm a cat");
  }
}

class DogPack {

  private Dog[] dogs;

  void makeArray(int size) {
    dogs = new Dog[size];
  }

  void addDog(int index, Dog aDog) {
    dogs[index] = aDog;
  }

  Dog biggestDog() {
    Dog biggestSize = dogs[0];
    for (Dog dog:dogs) {
      if (dog.isBigger(biggestSize)) {
        biggestSize = dog;
      }
    }
    return biggestSize;
  }

  void showDogs() {
    System.out.println("Dogs in this pack:");
    for (Dog d : dogs) {
      if (d != null) {
        System.out.println("(" + d.size + ", " + d.breed + ", " + d.name + ")");
      } else {
        System.out.println("No dog here");
      }
    }
  }

  public static void main (String[] args) {
    // int[] sizes = new int[]{3,4,5,6};
    //
    // for (int size:sizes) {
    //   DogPack aDogPack = new DogPack();
    //   aDogPack.makeArray(size);
    //   aDogPack.addDog(0, new Dog(20, "Beagle", "Lennie"));
    //   aDogPack.showDogs();
    // }
    DogPack aDogPack = new DogPack();
    aDogPack.makeArray(3);
    aDogPack.addDog(0, new Dog(4, "Beagle", "Fred"));
    aDogPack.addDog(1, new Dog(23, "Beagle", "George"));
    aDogPack.addDog(2, new Dog(5, "Beagle", "Ron"));
    aDogPack.showDogs();

    System.out.println(aDogPack.biggestDog().name);
  }

}

class DogTestDrive {
  public static void main (String[] args){

    //make dog array
    Dog[] myDogs = new Dog[3];
    int i = 0;
    for (i = 0; i < 3; i++) {
      //put some dogs in
      myDogs[i] = new Dog();

    }

    //tests getSize and setSize
    myDogs[0].setSize(5);
    System.out.println(myDogs[0].getSize());

    //tests isBigger
    myDogs[1].setSize(6);
    System.out.println(myDogs[0].isBigger(myDogs[1]));
  }
}
