package racingcar;

import java.util.List;

public class OutputView {
    private final String RESULT_MENTION = "실행결과";
    private final String PRESENT_MOVE = "-";
    private final String WINNER_MENTION = "가 최종 우승했습니다.";
    private final String CAR_NAMES_DELIMITER = ", ";
    private final String OUTPUT_DISPLAY_DELEMITER = " : ";

    public void resultMention() {
        System.out.println(RESULT_MENTION);
    }

    public void displayCarList(CarList carList) {
        for (Car car : carList.getCarList()) {
            displayCar(car);
        }
        System.out.println();
    }

    private void displayCar(Car car) {
        System.out.print(car.getName() + OUTPUT_DISPLAY_DELEMITER);
        for (int position = 0; position < car.getCurrentPosition(); position++) {
            System.out.print(PRESENT_MOVE);
        }
        System.out.println();
    }

    public void displayWinners(List<String> winners) {
        String stringWinners = String.join(CAR_NAMES_DELIMITER, winners);
        System.out.print(stringWinners + WINNER_MENTION);
    }
}
