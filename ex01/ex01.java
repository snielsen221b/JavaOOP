//def of dog class
class Dog {

  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("Ruff! Ruff!");
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

    // New dog d
    Dog d = new Dog();
    d.size = 40;
    d.bark();

    // New cat c
    Cat c = new Cat();
    c.breed = "Maine Coon";
    c.bark();
  }
}
