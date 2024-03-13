package racingCar.game.generator;

import java.util.Random;

public class RandomGenerator implements IntGenerator {

  private static final Random random = new Random();
private static final int bound = 10;

  @Override
  public int nextInt() {
    return random.nextInt(bound);
  }
}
