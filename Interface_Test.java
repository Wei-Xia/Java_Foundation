public class Interface_Test{

  public static void main(String[] args){

    Speaker s;
    Walker w;

    Dog d = new Dog();
    s = d;
    w = d;
    s.speak();
    w.walk();

    Human h = new Human();
    s= h;
    w= h;
    s.speak();
    w.walk();

  }

}
