package ru.sapphire.courses.oop;

public class OOPExample {

  String string;

  public OOPExample(String string) {
    this.string = string;
  }

  public final void m1(OOPExample this, int i) {
    System.out.println(this.string + i); // "Мама мыла раму!1"
  }

  public static void main(String... __) {
    new OOPExample("Мама мыла раму!")
        .m1(1);
  }

}
