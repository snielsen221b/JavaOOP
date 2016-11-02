public class MyFirstApp {

  public static void main (String[] args) {
    int x = 3;
    for (int i = 0; i <10; i+=1) {
      x = x + 2;
      var y = x - 5;
      if (x > 5){
        System.out.println("Woah slow down there. That's at least five");
      }
    }
    System.out.println("I Rule!");
    System.out.println("The World");
  }

}
