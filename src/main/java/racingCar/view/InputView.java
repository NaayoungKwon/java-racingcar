package racingCar.view;

import java.util.Scanner;

public class InputView {

  private final Scanner scanner;

  public InputView() {
    this.scanner = new Scanner(System.in);
  }

  public int inputInteger() {
    return scanner.nextInt();
  }

  public String inputString() {
    return scanner.next();
  }
}
