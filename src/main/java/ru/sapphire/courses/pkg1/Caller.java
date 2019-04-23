package ru.sapphire.courses.pkg1;

public class Caller {

  public static void main(String... __) {
    //    System.out.println(__[0]);
    //    Table.main();

    //    for (int i = 0; i < 10;) {
    //        i = i++;
    //        System.out.println("Hi");
    //    }

    double x = 0.0 / 0.0;

    System.out.println(Double.isNaN(x)); //true

    System.out.println(x != x); //true

    int a, b, c;

    a = b = c = 5;

    //    do {
    //      System.out.println("я  тут!");
    //      a++;
    //    } while (a < 10);

    for (int i = 1; ; ) {
      System.out.println("я  тут!");
      if (i++ > 7)
        a += i / 2;

      if (i < 5)
        continue;

      if (a > 10)
        break;
    }

    http:
    //kjhsfdgjksfg.adkjfhdsf.com
    for (int i = 1; ; ) {
      break http;
    }

    int[] gs = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < gs.length; i++) {
      System.out.println("g = " + gs[i]);
    }

    String s1 = "Lorem ipsum dolor sit amet";
    String s2 = new String("Lorem ipsum dolor sit amet");
    String s3 = s2.intern();
    System.out.println(s1.charAt(6)); // 'i'

    System.out.println(s1 == s2); // false
    System.out.println(s1 == s3); // true
    System.out.println(s2 == s3); // false

//    StringBuilder
//    StringBuffer

    //    for(expr1;expr2;expr3){
    //      body1
    //        if (expr4) continue;
    //      body2
    //    }

    //    expr1;
    //    while (expr2) {
    //      body;
    //      expr3;
    //    }
  }

}
