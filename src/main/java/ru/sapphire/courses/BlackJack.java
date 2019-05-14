package ru.sapphire.courses;

import java.io.IOException;
import org.apache.commons.math3.util.MathArrays;

public class BlackJack {

  static int[] cards = {
      0, 1, 2, 3, 4, 5, 6, 7, 8, // червы
      9, 10, 11, 12, 13, 14, 15, 16, 17, // бубны
      18, 19, 20, 21, 22, 23, 24, 25, 26, // крести
      27, 28, 29, 30, 31, 32, 33, 34, 35}; // пики

  static int value(int card) {
    int value = card % 9;
    switch (value) {
      case 0: return 6;
      case 1: return 7;
      case 2: return 8;
      case 3: return 9;
      case 4: return 10;
      case 5: return 2;
      case 6: return 3;
      case 7: return 4;
      case 8:
      default: return 11;
    }
  }

  public static final String LINE_SEPARATOR = System.lineSeparator();

  static char getCharacterFromUser() throws IOException {
    byte[] input = new byte[1 + LINE_SEPARATOR.length()];
    if (System.in.read(input) != input.length)
      throw new RuntimeException("Что-то не так с вводом");
    return (char) input[0];
  }

  public static void main(String... __) throws IOException {

    int userMoney = 100;
    int computerMoney = 100;
    int BET = 10;

    do {

      MathArrays.shuffle(cards);

      int userValue = 0;
      int count = 0;
      do {
        userValue += value(cards[count++]);
      } while (
          userValue < 11
              || userValue < 20 && askUser(userValue));

      userValue = userValue > 21 ? 0: userValue;

      int computerValue = 0;
      do {
        computerValue += value(cards[count++]);
      } while (computerValue < 17);

      computerValue = computerValue > 21 ? 0: computerValue;

      if (computerValue == userValue) {
        System.out.println("Победила дружба! :|");
      } if (computerValue > userValue) {
        System.out.println("Победил компьютер... У Вас теперь " + userMoney + " денег.:(");
        computerMoney += BET;
        userMoney -= BET;
      } else {
        System.out.println("Победили Вы! У Вас теперь " + userMoney + " денег. :)");
        userMoney += BET;
        computerMoney -= BET;
      }

    } while (computerMoney > 0 && userMoney > 0);

    if (computerMoney > 0) {
      System.out.println("Победил компьютер... :(");
    } else {
      System.out.println("Победили Вы! :)");
    }
  }

  private static boolean askUser(int userValue) throws IOException {
    System.out.println("У Вас " + userValue + " очков. Берём ещё? (\"y\" - Да, другой символ - Нет, Ctrl+C - Выход): ");
    return getCharacterFromUser() == 'y';
  }
}