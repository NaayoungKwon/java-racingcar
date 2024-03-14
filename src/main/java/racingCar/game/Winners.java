package racingCar.game;

import java.util.ArrayList;
import java.util.List;
import racingCar.game.Car;

public class Winners {

  public static List<Car> findWinners(List<Car> cars) {
    int maxPosition = getMaxPosition(cars);
    return findWinners(cars, maxPosition);
  }

  private static List<Car>  findWinners(List<Car> cars, int maxPosition) {
    List<Car> winners = new ArrayList<>();
    for (Car car : cars) {
      if (car.getPosition() == maxPosition) {  // 로직을 구현할 때 getter를 빼봐라
        winners.add(car);
      }
    }
    return winners;
  }

  private static int getMaxPosition(List<Car> cars) {
    int maxPosition = 0;
    for (Car car : cars) {
      maxPosition = Math.max(maxPosition, car.getPosition());
    }
    return maxPosition;
  }
}
