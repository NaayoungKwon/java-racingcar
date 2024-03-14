package racingCar.game;

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

  public Car(String name, int position) {
    verifyCarName(name);
    this.name = name;
    this.position = position;
    this.intGenerator = null;
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
    int randomNumber = intGenerator.nextInt();
    if (randomNumber >= 4) {
      position++;
    }
  }

  public void move(boolean canMove) {
    if (canMove) {
      position++;
    }
  }

//  public void move() {
//    position++;
//  }

  private void verifyCarName(String carName) {
    int maxCarNameLength = 5;
    if (carName != null && carName.length() > maxCarNameLength) {
      throw new RuntimeException(String.format("차의 이름은 %d자를 초과할 수 없습니다.", maxCarNameLength));
    }
  }

  public int max(int other){ // 이런식으로 해서 getter를 최대한 없앨 수 있다.
    if (this.position > other){
      return this.position;
    }
    return other;
  }
}
