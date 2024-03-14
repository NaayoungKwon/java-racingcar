package racingCar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingCar.game.Position;

public class PositionTest {

  @Test
  void create(){
    Position position = new Position(4); // 원시값을 포장함
    assertThat(position.getPosition()).isEqualTo(4); // getter를 안쓰고 해보자
    assertThat(new Position(4)).isEqualTo(new Position(4));
  }

}
