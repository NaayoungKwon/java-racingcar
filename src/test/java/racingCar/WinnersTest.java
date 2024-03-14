package racingCar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingCar.game.Car;
import racingCar.game.Winners;
import racingCar.game.generator.RandomGenerator;

public class WinnersTest {

  @Test
  void findWinnersTest(){
    // TDD를 할 때 앞에서부터 순차적으로 구현하지 않아도 된다.
    // 레이싱 게임 끝났을 때의 상태를 만들면 된다
    // 테스트 픽스처 (테스트를 만드는 과정)이 단순해야한다. 복잡하면 나중에 유지보수하기도 힘들다
   // 생성자를 잘 이용해라
   // 생성자를 여러개 만들어서 처음 position 상태를 지정하라
   // 생성자의 오버로딩 중복 코드는 다른 생성자를 호출할 수 있도록 해라
    // 테스트를 위해 생성자를 추가하는 습관
    RandomGenerator randomGenerator = new RandomGenerator(10);

    Car pobi = new Car("pobi", 2);
    Car crong = new Car("crong", 1);
    Car honux = new Car("honux", 2);
    List<Car> cars = Arrays.asList(pobi, crong, honux);
    List<Car> winners = Winners.findWinners(cars);
//    List<Car> winners = findWinners();
    assertThat(winners).hasSize(2);
    assertThat(winners).contains(pobi);

  }

}
