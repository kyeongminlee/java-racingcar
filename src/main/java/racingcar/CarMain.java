package racingcar;

public class CarMain {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        String[] carNames = inputView.carNames();
        int tryCounts = inputView.tryCount();

        outputView.resultMention();

        CarController carController = new CarController(carNames, tryCounts);

        while(!carController.isFinish()) {
            outputView.displayCarList(carController.nextRound());
        }

        outputView.displayWinners(carController.getWinner());
    }
}
