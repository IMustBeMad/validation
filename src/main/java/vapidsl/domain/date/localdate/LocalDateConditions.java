package vapidsl.domain.date.localdate;

import lombok.experimental.UtilityClass;
import vapidsl.common.SingleCondition;

import java.time.LocalDate;

@UtilityClass
public class LocalDateConditions {

    public static SingleCondition<LocalDate> isEqualTo(LocalDate otherDate) {
        return new SingleCondition<>(it -> it.isEqual(otherDate));
    }

    public static SingleCondition<LocalDate> isNoEqualTo(LocalDate otherDate) {
        return new SingleCondition<>(it -> !it.isEqual(otherDate));
    }

    public static SingleCondition<LocalDate> isAfter(LocalDate otherDate) {
        return new SingleCondition<>(it -> it.isAfter(otherDate));
    }

    public static SingleCondition<LocalDate> isBefore(LocalDate otherDate) {
        return new SingleCondition<>(it -> it.isBefore(otherDate));
    }

    public static SingleCondition<LocalDate> isAfterOrEqual(LocalDate otherDate) {
        return new SingleCondition<>(it -> it.isAfter(otherDate) || it.isEqual(otherDate));
    }

    public static SingleCondition<LocalDate> isBeforeOrEqual(LocalDate otherDate) {
        return new SingleCondition<>(it -> it.isBefore(otherDate) || it.isEqual(otherDate));
    }
}
