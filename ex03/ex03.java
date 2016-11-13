//def of dog class
class Dog {

  private int size;
  String breed;
  String name;

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
