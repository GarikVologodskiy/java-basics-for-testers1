package ru.sapphire.courses;

public class Slot {

  public static void main(String... __) {

    final int[] BARABANS = {0,2,1};
    final int SIZE = 3;
    final int MAX_VALUE = 10_000;
    final int BET = 10;

    int money = 100;

    while ((money -= BET) >= 0) {
      System.out.println("money = " + money);
      int value = (int) Math.round(Math.random() * MAX_VALUE);
      if (value == 0) {
        money += BET;
        continue;
      }
      BARABANS[0] = (BARABANS[0] + value) % SIZE;
      BARABANS[1] = (BARABANS[1] + value) % SIZE;
      BARABANS[2] = (BARABANS[2] + value) % SIZE;

      System.out.println("Выпало " + BARABANS[0] + " " + BARABANS[1] + " " + BARABANS[2]);

      if (BARABANS[0] == BARABANS[1] && BARABANS[0] == BARABANS[2]) {
        money += 1_000;
        System.out.println("Выигрышь!");
        break;
      } else
        System.out.println("Прогигрышь...");
    }

    System.out.println("money = " + money);
  }
}
