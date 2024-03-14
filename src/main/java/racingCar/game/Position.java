package racingCar.game;

public class Position {

  private final int number;

  public Position(int number){
    this.number = number;
  }

  public int getPosition() {
    return number;
  }

  @Override
  public boolean equals(Object o) {
    return this == o;
  }
}
