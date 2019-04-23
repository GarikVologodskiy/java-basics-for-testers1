package ru.sapphire.courses;

import java.math.BigInteger;
import java.util.Locale;

public class Table {

  public static void main(String... args) {

    System.out.println("Hello, World!");

    var x = 10;
    System.out.println("x = " + x);
    System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

    int a = ++x; // a=11, x = 11
//    int a = x++; // a=10, x = 11

    System.out.println("a = " + a);

    long y = Long.MAX_VALUE;
    System.out.println("y = " + y);

    char c = 65_535 - 8734;
    c = 'f';

    double v = 1.5;
    float f = 1.6f;

    boolean b = true;
    boolean b1 = false;

    //    Locale.getDefault().
    System.out.println("c = " + c);


  }
}
