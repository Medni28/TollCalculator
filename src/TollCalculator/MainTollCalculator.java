package TollCalculator;
import java.time.LocalDateTime;

public class MainTollCalculator {
        public static void main(String[] args) {
            TollCalculator tollCalculator = new TollCalculator();
            Car car = new Car();
            LocalDateTime localDateTime1 = LocalDateTime.of(2021, 12, 12, 9, 30, 00);
            LocalDateTime localDateTime2 = LocalDateTime.of(2021, 12, 12, 11, 40, 00);
            LocalDateTime localDateTime3 = LocalDateTime.of(2021, 12, 12, 13, 50, 00);
            LocalDateTime localDateTime4 = LocalDateTime.of(2021, 12, 12, 15, 55, 00);
            LocalDateTime localDateTime5 = LocalDateTime.of(2021, 12, 12, 17, 10, 00);
            LocalDateTime localDateTime6 = LocalDateTime.of(2021, 12, 12, 19, 15, 00);
            LocalDateTime localDateTime7 = LocalDateTime.of(2021, 12, 12, 21, 20, 00);
            LocalDateTime[] localDateTimes = {localDateTime1, localDateTime2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, localDateTime7};
            int fee = tollCalculator.getTollFee(car, localDateTimes);
            System.out.println(fee + "kr");
        }
    }
