package racingCar.game;

import java.util.List;
import racingCar.StringUtil;
import racingCar.game.generator.IntGenerator;

public class Car {

  private final String name;
  private int position;
  private final IntGenerator intGenerator;

  public Car(String name, IntGenerator intGenerator) {
    verifyCarName(name);
    this.name = name;
    this.position = 0;
    this.intGenerator = intGenerator;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public String getMovedPath() {
    return "-".repeat(position);
  }

  public void move() {
    int randomNumber = intGenerator.nextInt(10);
    if (randomNumber >= 4) {
      position++;
    }
  }

  private void verifyCarName(String carName) {
    int maxCarNameLength = 5;
    checkLength(carName, maxCarNameLength);
  }

  private void checkLength(String input, int allowedLength) {
    if (input != null && input.length() > allowedLength) {
      throw new RuntimeException(String.format("차의 이름은 %d자를 초과할 수 없습니다.", allowedLength));
    }
  }

}
