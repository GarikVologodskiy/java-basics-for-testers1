package ru.sapphire.courses.oop;

public class Clone implements Cloneable {

  int x;
  String s;
  boolean aBoolean;

  public Clone(int x, String s, boolean aBoolean) {
    this.x = x;
    this.s = s;
    this.aBoolean = aBoolean;
  }

  public static void main(String... __) {
    Clone kjhsfg = new Clone(1, "kjhsfg", true);

    System.out.println(kjhsfg.s);
  }

  @Override
  public String toString() {
    return "Clone{" +
               "x=" + x +
               ", s='" + s + '\'' +
               ", aBoolean=" + aBoolean +
               '}';
  }



  //  @Override
//  protected Clone clone() throws CloneNotSupportedException {
//    return super.clone();
//  }
}
