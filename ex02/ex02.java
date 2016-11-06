//def of dog class
class Dog {

  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("Ruff! Ruff!");
  }

  public static void main (String[] args) {
    //make dog array
    Dog[] myDogs = new Dog[3];
    int i = 0;
    for (i = 0; i < 3; i++) {
      //put some dogs in
      myDogs[i] = new Dog();

    }
    //define names for dogs
    myDogs[0].name = "George";
    myDogs[1].name = "BIll";
    myDogs[2].name = "Buttercup";
    //sizes for dogs
    myDogs[0].size = 3;
    myDogs[1].size = 42;
    myDogs[2].size = 97;

    //init index value for which dog is biggest
    int index = 0;

    for (i = 0; i < myDogs.length; i++) {
      //makes each dog bark
      myDogs[i].bark();

      //finds largest dog
      float max = 0f;
      if (myDogs[i].size > max) {
        max = myDogs[i].size;

        index = i;
      }
    }
    //prints biggest dog and size
    System.out.println(myDogs[index].name);
    System.out.println("is the biggest!");
    System.out.println(myDogs[index].size);
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
