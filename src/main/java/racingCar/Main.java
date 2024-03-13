package racingCar;

import java.util.List;
import racingCar.game.GameResult;
import racingCar.game.RacingCarGame;
import racingCar.ui.InputView;
import racingCar.ui.ResultView;

public class Main {

  public static void main(String[] args) {
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();

    resultView.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    List<String> carNames = StringUtil.splitComma(inputView.inputString());

    resultView.print("시도할 회수는 몇 회 인가요?");
    int gameTryNum = inputView.inputInteger();

    RacingCarGame racingCarGame = new RacingCarGame();
    racingCarGame.initiateGame(carNames);

    GameResult gameResult = racingCarGame.playGames(gameTryNum);

    resultView.print("실행 결과");
    for (String result : gameResult.getRoundResults()) {
      resultView.print(result);
    }

    resultView.print(makeWinnerMessage(gameResult.getWinners()));
  }

  
  private static String makeWinnerMessage(List<String> winners) {
    return String.join(", ", winners) + "가 최종 우승했습니다.";
  }

}
