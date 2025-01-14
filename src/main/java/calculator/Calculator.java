package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

  public static int calculate(String text) {

    if (isBlank(text)) {
      return 0;
    }

    return sum(toInts(split(text)));
  }

  private static boolean isBlank(String text) {
    return text == null || text.isEmpty();
  }

  private static String[] split(String text) {
    Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
    if (m.find()) {
      String customDelimiter = m.group(1);
      return m.group(2).split(customDelimiter);
    }
    return text.split(",|:");
  }

  private static int sum(int[] numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    return result;
  }

  private static int[] toInts(String[] values) {
    int[] numbers = new int[values.length];
    for (int i = 0; i < values.length; i++) {
      int number = Integer.parseInt(values[i]);
      verifyPositive(number);
      numbers[i] = number;
    }
    return numbers;
  }

  private static void verifyPositive(int number) {
    if (number < 0) {
      throw new RuntimeException("음수는 입력으로 올 수 없습니다.");
    }
  }

}
