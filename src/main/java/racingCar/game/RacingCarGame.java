package racingCar.game;

import java.util.ArrayList;
import java.util.List;
import racingCar.game.generator.IntGenerator;
import racingCar.game.generator.RandomGenerator;

public class RacingCarGame {

  private List<Car> cars;

  public RacingCarGame() {
    this.cars = new ArrayList<>();
  }

  public void initiateGame(int carNum) {
    IntGenerator intGenerator = new RandomGenerator();
    for (int i = 0; i < carNum; i++) {
      cars.add(new Car(intGenerator));
    }
  }

  public List<String> playGames(int round) {
    List<String> results = new ArrayList<>();
    for (int i = 0; i < round; i++) {
      playGame();
      results.add(getGameResult());
    }
    return results;
  }

  private void playGame() {
    for (Car car : cars) {
      car.move();
    }
  }

  private String getGameResult() {
    StringBuilder sb = new StringBuilder();
    for (Car car : cars) {
      sb.append(car.getMovedPath()).append("\n");
    }
    return sb.toString();
  }

}