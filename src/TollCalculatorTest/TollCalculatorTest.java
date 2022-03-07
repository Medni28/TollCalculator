package TollCalculatorTest;

import TollCalculator.Car;
import TollCalculator.MotorBike;
import TollCalculator.TollCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TollCalculatorTest {
    @Test
    public void test() {

        TollCalculator tollCalculator = new TollCalculator();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();
        int rushHourFee = tollCalculator.getTollFee(LocalDateTime.of(2021,12,10,8,25,48), motorBike); // 18
        int carFee = tollCalculator.getTollFee(LocalDateTime.of(2021,12,10, 12, 30,28), car);  // 11
        int motorBikeFee = tollCalculator.getTollFee(LocalDateTime.of(2021, 9, 14, 14, 14, 14), motorBike); // 8

        int[] actual = {rushHourFee, carFee, motorBikeFee};

        int[] expected = {18, 11,8};

        Assertions.assertEquals(actual, expected);
        System.out.println("Test = OKEY!");

    }
}