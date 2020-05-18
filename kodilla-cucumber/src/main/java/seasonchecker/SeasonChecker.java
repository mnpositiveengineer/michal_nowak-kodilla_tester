package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay date) {
        if (date.isBefore(MonthDay.of(6,21)) || date.isAfter(MonthDay.of(9,23))) {
            return "Nope";
        } else {
            return "Yes";
        }
    }
}
